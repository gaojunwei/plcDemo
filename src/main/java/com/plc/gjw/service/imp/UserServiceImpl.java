package com.plc.gjw.service.imp;

import com.alibaba.fastjson.JSON;
import com.plc.gjw.dao.BasicMybatisDao;
import com.plc.gjw.domain.EplUser;
import com.plc.gjw.domain.EplUserExample;
import com.plc.gjw.service.UserService;
import com.plc.gjw.user.dao.EplUserDao;
import com.plc.gjw.user.dao.EplUserHandDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component("userService")
public class UserServiceImpl implements UserService {
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    @Resource
    private EplUserDao eplUserDao;
    @Resource
    private EplUserHandDao eplUserHandDao;

    /**
     * 根据自定义条件修改用户信息
     * @param user
     * @param userExample
     * @return
     */
    @Override
    public int updateByExampleSelective(EplUser user, EplUserExample userExample) {
        log.info("UserServiceImpl_updateByExampleSelective[自定义条件修改用户信息]_start user:{}", JSON.toJSONString(user));
        user.setModifiedDate(new Date());

        Map<String,Object> map = new HashMap<>();
        map.put(BasicMybatisDao.UPDATE_RECORD,user);
        map.put(BasicMybatisDao.UPDATE_PARAMETER,userExample);

        int count = eplUserDao.updateByExampleSelective(map);
        log.info("UserServiceImpl_updateByExampleSelective[自定义条件修改用户信息]_end count:{}",count);
        return count;
    }

    /**
     * 扣减操作ID
     * @param user
     * @return
     */
    @Override
    public int updateByExampleSelective(EplUser user,Map<String,Object> conMap) {
        log.info("updateByExampleSelective[扣减操作ID]_start user:{}", JSON.toJSONString(user));
        user.setModifiedDate(new Date());

        Map<String,Object> map = new HashMap<>();

        map.put(BasicMybatisDao.UPDATE_RECORD,user);
        map.put(BasicMybatisDao.UPDATE_PARAMETER,conMap);

        int count = eplUserHandDao.updateByExampleSelective(map);
        log.info("updateByExampleSelective[扣减操作ID]_end count:{}",count);
        return count;
    }


    @Override
    public int insertSelective(EplUser user) {
        log.info("UserServiceImpl_insertUser[用户录入]_start user:{}", JSON.toJSONString(user));
        user.setCreatedDate(new Date());
        user.setModifiedDate(new Date());
        int count = eplUserDao.insertSelective(user);
        log.info("UserServiceImpl_insertUser[用户录入]_end count:{}",count);
        return count;
    }
}
