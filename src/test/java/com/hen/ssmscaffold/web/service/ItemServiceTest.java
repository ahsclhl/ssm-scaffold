package com.hen.ssmscaffold.web.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hen.ssmscaffold.web.entity.ItemEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
public class ItemServiceTest {
	
	private static final Logger logger = LoggerFactory.getLogger(ItemServiceTest.class);
	
	@Resource
	private ItemService itemService;
	
	@Test
	public void test() throws Exception {
		ItemEntity item = itemService.selectByPrimaryKey(1);
		logger.debug(item.toString());
	}

}
