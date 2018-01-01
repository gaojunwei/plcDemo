package com.plc.gjw.stock.dao;

import com.plc.gjw.dao.BasicMybatisDao;
import com.plc.gjw.domain.LockStock;
import com.plc.gjw.domain.LockStockExample;
import org.springframework.stereotype.Repository;

@Repository
public interface LockStockDao extends BasicMybatisDao<LockStock, LockStockExample> {
}