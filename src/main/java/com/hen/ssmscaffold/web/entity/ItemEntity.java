package com.hen.ssmscaffold.web.entity;

import com.hen.ssmscaffold.common.orm.BaseEntity;

public class ItemEntity extends BaseEntity<ItemEntity> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String groupcode;

    private String code;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupcode() {
        return groupcode;
    }

    public void setGroupcode(String groupcode) {
        this.groupcode = groupcode;
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

	@Override
	public String toString() {
		return "ItemEntity [id=" + id + ", groupcode=" + groupcode + ", code=" + code + ", name=" + name + "]";
	}
    
}