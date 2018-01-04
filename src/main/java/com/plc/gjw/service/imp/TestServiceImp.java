package com.plc.gjw.service.imp;

import com.plc.gjw.common.controller.result.BasicResult;
import com.plc.gjw.common.exception.AppException;
import com.plc.gjw.domain.EplMerchant;
import com.plc.gjw.domain.EplMerchantExample;
import com.plc.gjw.domain.EplUser;
import com.plc.gjw.domain.EplUserExample;
import com.plc.gjw.service.MerChantService;
import com.plc.gjw.service.TestService;
import com.plc.gjw.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Component
public class TestServiceImp implements TestService {
    private static final Logger logger = LoggerFactory.getLogger(TestServiceImp.class);

    @Resource
    UserService userService;
    @Resource
    MerChantService merChantService;

    @Override
    public BasicResult justTest(String userName, String merchantName,Long reduce) {
        BasicResult result = new BasicResult(false);

        if(StringUtils.isEmpty(userName)){
            result.setReturnCode("99999");
            result.setReturnMessage("参数为空操作失败");
            return result;
        }
        return ((TestServiceImp)AopContext.currentProxy()).justUpdate(userName,merchantName,reduce);
        //return justUpdate(userName,merchantName,reduce);

    }
    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED)
    public BasicResult justUpdate(String userName, String merchantName,Long reduce){
        logger.info("进入该方法");
        BasicResult result = new BasicResult(false);
        int count = 0;
        EplUser user = new EplUser();
        if(reduce==null){
            user.setRealName(userName);

            EplUserExample userExample = new EplUserExample();
            EplUserExample.Criteria userCriteria = userExample.createCriteria();
            userCriteria.andUserAccountEqualTo("zhangsan");

            count = userService.updateByExampleSelective(user,userExample);

            if (count!=1){
                throw new AppException("99999","会员修改失败");
            }
        }else{
            user.setOperatorId(reduce);

            Map<String,Object> conMap = new HashMap<>();
            conMap.put("id",23);
            conMap.put("user_account","zhangsan");

            count = userService.updateByExampleSelective(user,conMap);

            if (count!=1){
                throw new AppException("99999","扣减ID失败");
            }
        }


        EplMerchant merchant = new EplMerchant();
        merchant.setMerchantName(merchantName);

        EplMerchantExample merchantExample = new EplMerchantExample();
        EplMerchantExample.Criteria merchantExampleCriteria = merchantExample.createCriteria();
        merchantExampleCriteria.andIdEqualTo(Long.valueOf(1));

        count = merChantService.updateByExampleSelective(merchant,merchantExample);

        if (count!=1){
            throw new AppException("99999","商户修改失败");
        }
        result.setReturnCode("00000");
        result.setSuccess(true);
        result.setReturnMessage("操作成功！");
        return result;
    }
}