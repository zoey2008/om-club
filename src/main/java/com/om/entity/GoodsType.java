package com.om.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.om.framework.entity.IdEntity;


@Entity
@Table(name = "t_goods_type")
public class GoodsType extends IdEntity {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
