package com.plc.gjw.stock.dao;

import com.plc.gjw.dao.BasicMybatisDao;
import com.plc.gjw.domain.LockStockDetail;
import com.plc.gjw.domain.LockStockDetailExample;
import org.springframework.stereotype.Repository;

@Repository
public interface LockStockDetailDao extends BasicMybatisDao<LockStockDetail, LockStockDetailExample> {
}