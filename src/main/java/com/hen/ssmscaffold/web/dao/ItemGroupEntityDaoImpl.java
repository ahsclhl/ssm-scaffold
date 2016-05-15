package com.hen.ssmscaffold.web.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hen.ssmscaffold.web.entity.ItemEntity;
import com.hen.ssmscaffold.web.entity.ItemGroupEntity;

@Repository
public class ItemGroupEntityDaoImpl extends SqlSessionDaoSupport implements ItemGroupEntityDao {

	
	private static final Logger logger = LoggerFactory.getLogger(ItemGroupEntityDaoImpl.class);
	@Autowired
	private ItemEntityDao itemEntityDao;
	
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	@Override
	public ItemGroupEntity selectByPrimaryKey(Object primaryKey) {
		ItemGroupEntity itemGroup = new ItemGroupEntity();
		try {
			ItemGroupEntityDao dao = this.getSqlSession().getMapper(ItemGroupEntityDao.class);
			itemGroup = dao.selectByPrimaryKey(primaryKey);
		} catch (Exception e) {
			logger.debug(e.getMessage());
			throw e;
		}
		return itemGroup;
	}
	
	@Override
	public ItemGroupEntity selectByPrimaryKeyWithJoin(Object primaryKey) {
		ItemGroupEntityDao dao = this.getSqlSession().getMapper(ItemGroupEntityDao.class);
		return dao.selectByPrimaryKeyWithJoin(primaryKey);
	}

	@Override
	public int deleteByPrimaryKey(Object id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(ItemGroupEntity record) {
		ItemGroupEntityDao dao = this.getSqlSession().getMapper(ItemGroupEntityDao.class);
		return dao.insert(record);
	}

	@Override
	public int insertSelective(ItemGroupEntity record) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	@Override
	public int insertAll(ItemGroupEntity itemGroup) {
		int res = insert(itemGroup);
		for(ItemEntity item : itemGroup.getItems()) {
			itemEntityDao.insert(item);
		}
		return res;
	}

	@Override
	public int updateByPrimaryKeySelective(ItemGroupEntity record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(ItemGroupEntity record) {
		// TODO Auto-generated method stub
		return 0;
	}


}
