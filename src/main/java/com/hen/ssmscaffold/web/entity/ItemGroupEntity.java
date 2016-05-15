package com.hen.ssmscaffold.web.entity;

import java.util.List;

import com.hen.ssmscaffold.common.orm.BaseEntity;

public class ItemGroupEntity extends BaseEntity<ItemGroupEntity> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String code;

    private String name;
    
    private List<ItemEntity> items;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ItemEntity> getItems() {
		return items;
	}

	public void setItems(List<ItemEntity> items) {
		this.items = items;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ItemGroupEntity [id=" + id + ", code=" + code + ", name=" + name + ", items=" + items + "]";
	}


}