package com.plc.gjw.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.plc.gjw.common.controller.result.BasicResult;
import com.plc.gjw.common.controller.result.PageResult;
import com.plc.gjw.common.enums.InnerErrorCode;
import com.plc.gjw.common.enums.MerchantResultEnum;
import com.plc.gjw.common.exception.AppException;
import com.plc.gjw.domain.EplUserMerchant;
import com.plc.gjw.domain.data.MerchantData;
import com.plc.gjw.service.MerChantService;
import com.plc.gjw.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value="/epl/merchant")
public class MerchantController {
    private static final Logger logger = LoggerFactory.getLogger(MerchantController.class);

    @Resource
    MerChantService merChantService;
    @Resource
    UserService userService;

    @RequestMapping(value = "datetest")
    public BasicResult dateParamTest(@RequestParam("date_str")String date)
    {
        BasicResult result = new BasicResult(false);
        logger.info("date 值为："+date);
        return result;
    }

    /**
     * 分页查询商户列表信息查询
     *
     * @param pageNum 页数
     * @param pageSize 每页数量
     * @return
     */
    @RequestMapping(value = "listmerchant", method = RequestMethod.GET)
    public PageResult list(@RequestParam(required = false, defaultValue = "1") int pageNum, @RequestParam(required = false, defaultValue = "20") int pageSize) {
        PageResult result = new PageResult();
        logger.info("MerchantController_list[分页获取商户信息列表查询]_start ");
        if (logger.isDebugEnabled()) {
            logger.debug("enter ProductController.list");
        }
        //查询条件
        Map<String, Object> map = new HashMap<>();
        map.put("user_type","common");
        map.put("parent_id",0);
        map.put("status","ACTIVE");
        map.put("beginTime",getAppointDate("2017-12-24 01:25:56"));
        map.put("endTime",new Date());

        Page<EplUserMerchant> page = merChantService.findByMap( map, pageNum, pageSize);

        result.setSuccess(true);
        result.setReturnCode(InnerErrorCode.TRX_SUCCESS.getValue());
        result.setPageNo(page.getPageNum());
        result.setPageSize(page.getPageSize());
        result.setData(page.getResult());
        result.setTotalCount(page.getTotal());
        logger.info("MerchantController_list[分页获取商户信息列表查询]_end status:{}", result.getSuccess());
        return result;
    }

    public Date getAppointDate(String dateStr) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = format.parse(dateStr);
            System.out.println(">>>>>>>>>"+date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 添加商户信息
     * @param merchantData
     * @return
     */
    @RequestMapping(value = "save")
    public BasicResult save (@RequestBody MerchantData merchantData) {
        logger.info("MerchantController_save[添加商户信息]_start merchantData:{}", JSON.toJSONString(merchantData));
        if (logger.isDebugEnabled()) {
            logger.debug("enter MerchantController.save()");
        }

        BasicResult cResult = commenCheck(merchantData);
        if(!cResult.getSuccess())
        {
            return cResult;
        }
        //进行保存操作
        BasicResult result = new BasicResult();
        try {
            result = merChantService.save(merchantData);
        } catch (Exception e) {
            if(e instanceof AppException) {// 唯一约束
                result.setReturnCode(((AppException) e).getKey());
                result.setReturnMessage(((AppException) e).getInfo());
            }else{
                logger.error(e.getMessage(),e);
                result.setReturnCode(InnerErrorCode.EPL_TRADE_FAIL.getValue());
                result.setReturnMessage("系统异常，操作失败");
            }
            logger.info("***************"+e.getMessage());
        }
        logger.info("MerchantController_save[添加商户信息]_end status:{}", result.getSuccess());
        return result;
    }

    /**
     * 修改商户信息
     * @param merchantData
     * @return
     */
    @RequestMapping(value = "modify")
    public BasicResult modify (@RequestBody MerchantData merchantData) {
        logger.info("MerchantController_modify[修改商户信息]_start merchantData:{}", JSON.toJSONString(merchantData));
        if (logger.isDebugEnabled()) {
            logger.debug("enter MerchantController.modify");
        }
        //参数合法校验
        BasicResult cResult = commenCheck(merchantData);
        if(!cResult.getSuccess())
        {
            return cResult;
        }
        //进行修改操作
        BasicResult result = new BasicResult();
        try {
            result = merChantService.updateMerchantAndUser(merchantData);
        } catch (Exception e) {
            if(e instanceof AppException) {
                result.setReturnCode(((AppException) e).getKey());
                result.setReturnMessage(((AppException) e).getInfo());
            }else{
                logger.error(e.getMessage(),e);
                result.setReturnCode(InnerErrorCode.EPL_TRADE_FAIL.getValue());
                result.setReturnMessage("系统异常，操作失败");
            }
            logger.info("***************"+e.getMessage());
        }
        //更新商户信息
        logger.info("MerchantController_updateMerchantInfoByPrimaryKey[修改商户信息]_end status:{}", result.getSuccess());
        return result;
    }

    /**
     * 商户增加和商户修改校验方法
     * @param merchantData
     * @return
     */
    private BasicResult commenCheck(MerchantData merchantData){
        BasicResult result = new BasicResult(false);
        //参数判空校验 & 合法校验
        if (StringUtils.isEmpty(merchantData.getMerchantName())){
            result.setReturnCode(MerchantResultEnum.MERCHANT_UPDATE_BLANK_ERROR.getCode());
            result.setReturnMessage("公司名称参数不能为空，操作失败");
            return result;
        }
        if (StringUtils.isEmpty(merchantData.getUserAccount())){
            result.setReturnCode(MerchantResultEnum.MERCHANT_UPDATE_BLANK_ERROR.getCode());
            result.setReturnMessage("商户账号参数不能为空，操作失败");
            return result;
        }
        if (StringUtils.isEmpty(merchantData.getUserPassword())){
            result.setReturnCode(MerchantResultEnum.MERCHANT_UPDATE_BLANK_ERROR.getCode());
            result.setReturnMessage("商户密码参数不能为空，操作失败");
            return result;
        }
        //是否开启二维码（on:开启，off:关闭；）
        if (StringUtils.isEmpty(merchantData.getIfOpenQrcode())){
            result.setReturnCode(MerchantResultEnum.MERCHANT_UPDATE_BLANK_ERROR.getCode());
            result.setReturnMessage("商户二维码配置参数不能为空，操作失败");
            return result;
        }
        if (!merchantData.getIfOpenQrcode().equals("on") && !merchantData.getIfOpenQrcode().equals("off") ){
            result.setReturnCode(MerchantResultEnum.MERCHANT_UPDATE_BLANK_ERROR.getCode());
            result.setReturnMessage("商户二维码配置参数不合法，操作失败");
            return result;
        }
        if(merchantData.getIfOpenQrcode().equals("off")){
            merchantData.setQrcodeType("");
            merchantData.setQrcodeUrl("");
        }
        if(merchantData.getIfOpenQrcode().equals("on")){
            if(StringUtils.isEmpty(merchantData.getQrcodeType())){
                result.setReturnCode(MerchantResultEnum.MERCHANT_UPDATE_BLANK_ERROR.getCode());
                result.setReturnMessage("商户二维码展示方式参数不合法，操作失败");
                return result;
            }
            if(!"static".equals(merchantData.getQrcodeType()) && !"dynamic".equals(merchantData.getQrcodeType()) && !"scart".equals(merchantData.getQrcodeType())){
                result.setReturnCode(MerchantResultEnum.MERCHANT_UPDATE_BLANK_ERROR.getCode());
                result.setReturnMessage("商户二维码展示方式参数不合法，操作失败");
                return result;
            }
            if(!"scart".equals(merchantData.getQrcodeType())){
                if(StringUtils.isEmpty(merchantData.getQrcodeUrl())){
                    result.setReturnCode(MerchantResultEnum.MERCHANT_UPDATE_BLANK_ERROR.getCode());
                    result.setReturnMessage("商户二维码内容值参数不合法，操作失败");
                    return result;
                }
            }
        }
        if (StringUtils.isEmpty(merchantData.getAddress())){
            result.setReturnCode(MerchantResultEnum.MERCHANT_UPDATE_BLANK_ERROR.getCode());
            result.setReturnMessage("详细地址参数不能为空，操作失败");
            return result;
        }
        if(merchantData.getMerchantLong() == null || merchantData.getMerchantLatitude() == null){
            result.setReturnCode(MerchantResultEnum.MERCHANT_UPDATE_BLANK_ERROR.getCode());
            result.setReturnMessage("商户地理位置参数不能为空，操作失败");
            return result;
        }
        if (StringUtils.isEmpty(merchantData.getMerchantLogo())){
            result.setReturnCode(MerchantResultEnum.MERCHANT_UPDATE_BLANK_ERROR.getCode());
            result.setReturnMessage("商户LOGO参数不能为空，操作失败");
            return result;
        }
        if (StringUtils.isEmpty(merchantData.getMerchantBanner())){
            result.setReturnCode(MerchantResultEnum.MERCHANT_UPDATE_BLANK_ERROR.getCode());
            result.setReturnMessage("商户背景图参数不能为空，操作失败");
            return result;
        }
        if (StringUtils.isEmpty(merchantData.getIfOpenErp()) || (!merchantData.getIfOpenErp().equals("on") && !merchantData.getIfOpenErp().equals("off"))){
            result.setReturnCode(MerchantResultEnum.MERCHANT_UPDATE_BLANK_ERROR.getCode());
            result.setReturnMessage("是否开启库存管理参数不合法，操作失败");
            return result;
        }
        result.setSuccess(true);
        return result;
    }
}
