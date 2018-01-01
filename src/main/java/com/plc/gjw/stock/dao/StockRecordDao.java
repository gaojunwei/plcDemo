package com.plc.gjw.stock.dao;

import com.plc.gjw.dao.BasicMybatisDao;
import com.plc.gjw.domain.StockRecord;
import com.plc.gjw.domain.StockRecordExample;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRecordDao extends BasicMybatisDao<StockRecord, StockRecordExample> {
}