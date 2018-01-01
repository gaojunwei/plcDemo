package com.plc.gjw.user.dao;

import com.plc.gjw.dao.BasicMybatisDao;
import com.plc.gjw.domain.EplMerchant;
import com.plc.gjw.domain.EplMerchantExample;
import org.springframework.stereotype.Repository;

@Repository
public interface EplMerchantDao extends BasicMybatisDao<EplMerchant, EplMerchantExample> {
}
