package com.plc.gjw.stock.dao;

import com.plc.gjw.dao.BasicMybatisDao;
import com.plc.gjw.domain.BackStock;
import com.plc.gjw.domain.BackStockExample;
import org.springframework.stereotype.Repository;

@Repository
public interface BackStockDao extends BasicMybatisDao<BackStock, BackStockExample> {
}
