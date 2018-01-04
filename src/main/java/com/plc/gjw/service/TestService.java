package com.plc.gjw.service;

import com.plc.gjw.common.controller.result.BasicResult;
import com.plc.gjw.domain.EplUser;
import com.plc.gjw.domain.EplUserExample;

/**
 * 测试接口
 */
public interface TestService {

    BasicResult justTest(String userName,String merchantName,Long reduce);

}
