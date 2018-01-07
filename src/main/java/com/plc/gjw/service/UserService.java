package com.plc.gjw.service;

import com.plc.gjw.domain.EplUser;
import com.plc.gjw.domain.EplUserExample;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 系统用户类接口
 */
public interface UserService {


    /**
     * 保存用户
     * @param user
     */
    int insertSelective(EplUser user);
    /**
     * 根据自定义条件修改用户信息
     * @param user
     * @param userExample
     * @return
     */
    int updateByExampleSelective(EplUser user, EplUserExample userExample);
    /**
     * 扣减操作ID
     * @param user
     * @return
     */
    int updateByExampleSelective(EplUser user,Map<String,Object> conMap);
    List<EplUser> listUserByCon(Date startDate, Date endDate);

}
