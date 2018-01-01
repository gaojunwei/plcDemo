package com.plc.gjw.service;

import com.plc.gjw.domain.EplUser;
import com.plc.gjw.domain.EplUserExample;

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

}
