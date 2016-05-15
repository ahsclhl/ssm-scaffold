package com.hen.ssmscaffold.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hen.ssmscaffold.web.entity.ItemEntity;
import com.hen.ssmscaffold.web.entity.ItemGroupEntity;
import com.hen.ssmscaffold.web.service.ItemGroupService;
import com.hen.ssmscaffold.web.service.ItemService;

@Controller
// @Scope("prototype")
@RequestMapping({ "/test" })
public class TestController {

	private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	public TestController() {
		logger.debug("TestController");
	}

	@Autowired
	private ItemGroupService itemGroupService;
	@Autowired
	private ItemService itemService;


	@RequestMapping("itemGroup")
	@Transactional
	public void selectItemGroup(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ItemGroupEntity itemGroup = itemGroupService.selectByPrimaryKey(1);
		logger.debug(itemGroup.toString());
		response.getWriter().println(itemGroup.toString());
		
		// Test for cache
		ItemEntity item = itemService.selectByPrimaryKey(1);
		logger.debug(item.toString());
		
		ItemEntity item2 = itemService.selectByPrimaryKey(1);
		logger.debug(item2.toString());
		
	}
	
	@RequestMapping("/itemGroup/insert")
	@Transactional
	public void insertItemGroup(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ItemGroupEntity itemGroup = new ItemGroupEntity();
		itemGroup.setCode("book");
		itemGroup.setName("book");
		logger.debug("Befor insert, id is: "+itemGroup.getId());
		int res = itemGroupService.insert(itemGroup);
		logger.debug("After insert, id is: "+itemGroup.getId());
		response.getWriter().println(res);
	}
	
	@RequestMapping("/itemGroup/insertAll")
	@Transactional
	public void insertItemGroupAll(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ItemGroupEntity itemGroup = new ItemGroupEntity();
		itemGroup.setCode("book");
		itemGroup.setName("book");
		
		ItemEntity item1=new ItemEntity();
		item1.setCode("ii1");
		item1.setName("ii1");
		item1.setGroupcode("book");
		
		ItemEntity item2=new ItemEntity();
		item2.setCode("ii2");
		item2.setName("ii2");
		item2.setGroupcode("book");
		
		List<ItemEntity> items = new ArrayList<>();
		items.add(item1);
		items.add(item2);
		itemGroup.setItems(items);
		
		logger.debug("Befor insert, id is: "+itemGroup.getId());
		int res = itemGroupService.insertAll(itemGroup);
		logger.debug("After insert, id is: "+itemGroup.getId());
		response.getWriter().println(res);
	}
	
	@RequestMapping("itemGroupWithJoin")
	public void selectItemGroupWithJoin(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ItemGroupEntity itemGroups = itemGroupService.selectByPrimaryKeyWithJoin(1);
		logger.debug(itemGroups.toString());
		response.getWriter().println(itemGroups.toString());
	}
	
	@RequestMapping("item")
	public void selectItem(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ItemEntity item = itemService.selectByPrimaryKey(1);
		logger.debug(item.toString());
		response.getWriter().println(item.toString());
	}

}
