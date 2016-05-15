package com.hen.ssmscaffold.web.dao;

import com.hen.ssmscaffold.common.orm.BaseDao;
import com.hen.ssmscaffold.web.entity.ItemGroupEntity;

public interface ItemGroupEntityDao extends BaseDao<ItemGroupEntity> {
	ItemGroupEntity selectByPrimaryKeyWithJoin(Object primaryKey);
	int insertAll(ItemGroupEntity itemGroup);
}