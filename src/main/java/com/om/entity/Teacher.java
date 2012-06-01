package com.om.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.om.framework.entity.IdEntity;


@Entity
@Table(name = "t_teacher")
public class Teacher extends IdEntity {
	private String name;
	private String descs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescs() {
		return descs;
	}

	public void setDescs(String descs) {
		this.descs = descs;
	}

}
