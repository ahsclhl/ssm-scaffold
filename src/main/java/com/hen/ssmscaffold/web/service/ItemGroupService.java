package com.hen.ssmscaffold.web.service;

import org.springframework.stereotype.Service;

import com.hen.ssmscaffold.common.orm.BaseService;
import com.hen.ssmscaffold.web.dao.ItemGroupEntityDao;
import com.hen.ssmscaffold.web.entity.ItemGroupEntity;

@Service
public class ItemGroupService extends BaseService<ItemGroupEntity, ItemGroupEntityDao> {
	public ItemGroupEntity selectByPrimaryKeyWithJoin(int id) {
		ItemGroupEntityDao itemGroupDao = (ItemGroupEntityDao) dao;
		return itemGroupDao.selectByPrimaryKeyWithJoin(id);
	}
	
	public int insertAll(ItemGroupEntity itemGroup) {
		ItemGroupEntityDao itemGroupDao = (ItemGroupEntityDao) dao;
		return itemGroupDao.insertAll(itemGroup);
	}
}
