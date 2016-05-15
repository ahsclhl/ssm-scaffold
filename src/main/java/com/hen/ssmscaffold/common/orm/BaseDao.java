package com.hen.ssmscaffold.common.orm;

public interface BaseDao<T extends BaseEntity<T>> {
    int deleteByPrimaryKey(Object id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Object id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
