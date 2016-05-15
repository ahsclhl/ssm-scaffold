package com.hen.ssmscaffold.common.orm;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseService<T extends BaseEntity<T>, D extends BaseDao<T>> {

	@Autowired
	protected D dao;

	public T selectByPrimaryKey(Object primaryKey) throws Exception {
		return dao.selectByPrimaryKey(primaryKey);
	}
	
//	public List<T> selectAll() throws Exception {
//		return dao.selectAll();
//	}

//	@Transactional(rollbackFor = { Exception.class })
//	public T selectByPrimaryKeyForUpdate(Object primaryKey) throws Exception {
//		return dao.selectByPrimaryKeyForUpdate(primaryKey);
//	}

	public int update(T t) throws Exception {
		return dao.updateByPrimaryKey(t);
	}
	
	public int insert(T t) throws Exception {
		return dao.insert(t);
	}
}
