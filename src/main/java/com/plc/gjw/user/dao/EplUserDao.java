package com.plc.gjw.user.dao;

import com.plc.gjw.dao.BasicMybatisDao;
import com.plc.gjw.domain.EplUser;
import com.plc.gjw.domain.EplUserExample;
import org.springframework.stereotype.Repository;

@Repository
public interface EplUserDao extends BasicMybatisDao<EplUser, EplUserExample> {
}
