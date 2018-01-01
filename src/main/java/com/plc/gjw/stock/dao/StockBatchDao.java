package com.plc.gjw.stock.dao;

import com.plc.gjw.dao.BasicMybatisDao;
import com.plc.gjw.domain.StockBatch;
import com.plc.gjw.domain.StockBatchExample;
import org.springframework.stereotype.Repository;

@Repository
public interface StockBatchDao extends BasicMybatisDao<StockBatch, StockBatchExample> {
}