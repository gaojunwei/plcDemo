package com.plc.gjw.stock.dao;

import com.plc.gjw.dao.BasicMybatisDao;
import com.plc.gjw.domain.FrontStock;
import com.plc.gjw.domain.FrontStockExample;
import org.springframework.stereotype.Repository;

@Repository
public interface FrontStockDao extends BasicMybatisDao<FrontStock, FrontStockExample> {
}