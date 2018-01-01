package com.plc.gjw.dao;

import java.util.List;
import java.util.Map;

public interface BasicMybatisDao<T, E> {

    public final static String UPDATE_RECORD = "record";
    public final static String UPDATE_PARAMETER = "example";

    int insert(T product);

    int insertSelective(T product);

    int updateByPrimaryKeySelective(T product);

    int updateByExampleSelective(Map<String, Object> map);

    long countByExample(E example);

    T selectByPrimaryKey(long id);

    List<T> selectByExample(E example);

    List<T> selectAllInfo();
}
