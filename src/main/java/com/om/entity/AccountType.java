package com.om.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.om.framework.entity.IdEntity;


@Entity
@Table(name = "t_account_type")
public class AccountType extends IdEntity {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
