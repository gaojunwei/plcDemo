package com.plc.gjw.service.imp;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.plc.gjw.common.controller.result.BasicResult;
import com.plc.gjw.common.enums.InnerErrorCode;
import com.plc.gjw.common.enums.MerchantResultEnum;
import com.plc.gjw.common.exception.AppException;
import com.plc.gjw.common.utile.EncryptionUtils;
import com.plc.gjw.domain.*;
import com.plc.gjw.domain.data.MerchantData;
import com.plc.gjw.service.MerChantService;
import com.plc.gjw.service.UserService;
import com.plc.gjw.user.dao.EplMerchantDao;
import com.plc.gjw.user.dao.EplUserMerchantDao;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component("merChantService")
public class MerChantServiceImpl implements MerChantService {
    private static final Logger log = LoggerFactory.getLogger(MerChantServiceImpl.class);
    @Resource
    EplMerchantDao eplMerchantDao;
    @Resource
    UserService userService;
    @Resource
    private EplUserMerchantDao eplUserMerchantDao;

    /**
     * 分页查询商户与主账号信息信息
     * @param map
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public Page<EplUserMerchant> findByMap(Map<String, Object> map, int pageNum, int pageSize) {
        log.info("MerChantServiceImpl_findByMap[分页查询商户与主账号信息信息]_start map:{}", JSON.toJSONString(map));
        Page<EplUserMerchant> result = PageHelper.startPage(pageNum, pageSize).doSelectPage(
                new ISelect() {
                    @Override
                    public void doSelect() {
                        eplUserMerchantDao.selectMerchantUserListByCon(map);
                    }
                }
        );
        log.info("MerChantServiceImpl_findByMap[查询商户与主账号信息信息]_end result:{}", JSON.toJSONString(result));
        return result;
    }

    /**
     * 商户添加及主账号
     * @param merchantData
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED)
    public BasicResult save(MerchantData merchantData){
        BasicResult result = new BasicResult(false);
        //商家信息
        EplMerchant merchant = new EplMerchant();
        //封装属性
        setAttr(merchant,merchantData);

        //保存商户信息
        try {
            insertMerchant(merchant);
            System.out.println("返回自增主键："+merchant.getId());
        } catch (Exception e) {
            log.info("新建商户信息，保存数据库失败，bean:{}", merchant.getMerchantName(), e);
            throw new AppException(InnerErrorCode.USER_SAVE_FAIL.getValue(), "新建商户信息，保存数据库失败");
        }

        EplMerchantExample example = new EplMerchantExample();
        EplMerchantExample.Criteria criteria = example.createCriteria();
        criteria.andMerchantNameEqualTo(merchant.getMerchantName());
        criteria.andAddressEqualTo(merchant.getAddress());
        criteria.andMerchantLogoEqualTo(merchant.getMerchantLogo());

        List<EplMerchant> list = eplMerchantDao.selectByExample(example);
        merchant = list.get(0);
        System.out.println("查询自增主键："+merchant.getId());

        //账户表（依赖商家的id）
        EplUser user = new EplUser();
        user.setMerchentId(merchant.getId());
        user.setUserAccount(merchantData.getUserAccount());
        user.setUserPassword(EncryptionUtils.md5(merchantData.getUserPassword()));
        user.setOperator(merchantData.getCreateMan());
        user.setOperatorId(merchantData.getCreateManId());
        user.setUserType("common");
        user.setStatus("ACTIVE");
        try {
            userService.insertSelective(user);
        } catch (Exception e) {
            if(e instanceof DuplicateKeyException) {
                log.info("新建商户登录账号违反唯一约束，bean:{}", user.getUserAccount(), e);
                throw new AppException(InnerErrorCode.DATA_EXIST.getValue(), "商户账号已经被占用，操作失败");
            } else {
                throw new AppException(InnerErrorCode.EPL_TRADE_FAIL.getValue(), "商户账号保存失败，请重试");
            }
        }
        result.setSuccess(true);
        result.setReturnCode(MerchantResultEnum.MERCHANT_ADD_SUCCESS.getCode());
        result.setReturnMessage(MerchantResultEnum.MERCHANT_ADD_SUCCESS.getMsg());
        return result;
    }

    /**
     * 根据主键修改商户信息
     * @param merchantData
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED)
    public BasicResult updateMerchantAndUser(MerchantData merchantData) {
        BasicResult result = new BasicResult(false);
        Date date = new Date();
        //更新商户信息
        EplMerchant merchant = new EplMerchant();
        merchant.setId(merchantData.getMerchantId());
        //封装属性
        setAttr(merchant,merchantData);
        //修改商户信息
        int count;
        try {
            count = updateByPrimaryKeySelective(merchant);
        } catch (Exception e) {
            log.info("更新商户信息，保存数据库失败，bean:{}", merchant.getMerchantName(), e);
            throw new AppException(InnerErrorCode.USER_SAVE_FAIL.getValue(), "更新商户信息，保存数据库失败");
        }
        if(count!=1)
        {
            throw new AppException(InnerErrorCode.USER_SAVE_FAIL.getValue(), "更新商户信息失败，请重试");
        }

        //用户表-账号密码修改
        EplUser user = new EplUser();
        user.setUserPassword(EncryptionUtils.md5(merchantData.getUserPassword()));
        user.setOperator(merchantData.getCreateMan());
        user.setOperatorId(merchantData.getCreateManId());
        //组合条件
        EplUserExample userExample = new EplUserExample();
        EplUserExample.Criteria userCriteria = userExample.createCriteria();
        userCriteria.andUserAccountEqualTo(merchantData.getUserAccount());

        //根据用户账号修改用户信息
        count = userService.updateByExampleSelective(user,userExample);
        if(count!=1)
        {
            throw new AppException(InnerErrorCode.USER_SAVE_FAIL.getValue(), "更新商户账号信息失败，请重试");
        }
        result.setSuccess(true);
        result.setReturnCode(MerchantResultEnum.MERCHANT_UPDATE_SUCCESS.getCode());
        result.setReturnMessage(MerchantResultEnum.MERCHANT_UPDATE_SUCCESS.getMsg());
        return result;
    }

    /**
     * 根据商户ID修改商户信息
     * @param eplMerchant
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(EplMerchant eplMerchant) {
        log.info("MerChantServiceImpl_updateByPrimaryKeySelective[根据商户ID修改商户信息]_start user:{}", JSON.toJSONString(eplMerchant));
        eplMerchant.setModifiedDate(new Date());
        int count = eplMerchantDao.updateByPrimaryKeySelective(eplMerchant);
        log.info("MerChantServiceImpl_updateByPrimaryKeySelective[根据商户ID修改商户信息]_end count:{}",count);
        return count;
    }

    /**
     * 插入商户信息
     * @param eplMerchant
     * @return
     */
    @Override
    public int insertMerchant(EplMerchant eplMerchant) {
        log.info("MerChantServiceImpl_insertMerchant[商户录入]_start merchant:{}", JSON.toJSONString(eplMerchant));
        Date date = new Date();
        eplMerchant.setCreatedDate(date);
        eplMerchant.setModifiedDate(date);
        int count = eplMerchantDao.insertSelective(eplMerchant);
        log.info("MerChantServiceImpl_insertMerchant[商户录入]_end count:{}",count);
        return count;
    }
    /**
     * 封装属性
     */
    public void setAttr(EplMerchant merchant,MerchantData merchantData){
        merchant.setMerchantName(merchantData.getMerchantName());
        merchant.setAddress(merchantData.getAddress());

        merchant.setIfOpenQrcode(merchantData.getIfOpenQrcode());
        merchant.setQrcodeType(merchantData.getQrcodeType());
        merchant.setQrcodeUrl(merchantData.getQrcodeUrl());

        merchant.setMerchantLong(merchantData.getMerchantLong());
        merchant.setMerchantLatitude(merchantData.getMerchantLatitude());

        merchant.setMerchantLogoKey(merchantData.getMerchantLogo());
        merchant.setMerchantLogo(merchantData.getMerchantLogo());

        merchant.setIfOpenErp(merchantData.getIfOpenErp());

        if(!StringUtils.isEmpty(merchantData.getMerchantSecretkey())){
            merchant.setMerchantSecretkey(merchantData.getMerchantSecretkey());
        }
        merchant.setOperator(merchantData.getCreateMan());
        merchant.setOperatorId(merchantData.getCreateManId());
    }

}
