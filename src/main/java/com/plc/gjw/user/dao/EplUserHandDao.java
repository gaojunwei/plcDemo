package com.plc.gjw.user.dao;

import com.plc.gjw.dao.BasicMybatisDao;
import com.plc.gjw.domain.EplUser;
import com.plc.gjw.domain.EplUserExample;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface EplUserHandDao extends EplUserDao {
   //int updateByExampleSelective(EplUser eplUser);
   @Override
   int updateByExampleSelective(Map<String,Object> map);
}
