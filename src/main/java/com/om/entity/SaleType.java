package com.om.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springside.examples.miniweb.entity.IdEntity;

@Entity
@Table(name = "t_sale_type")
public class SaleType extends IdEntity {
	private String name;
	private int cash_amount;
	private int real_amount;
	private int is_active;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCash_amount() {
		return cash_amount;
	}

	public void setCash_amount(int cash_amount) {
		this.cash_amount = cash_amount;
	}

	public int getReal_amount() {
		return real_amount;
	}

	public void setReal_amount(int real_amount) {
		this.real_amount = real_amount;
	}

	public int getIs_active() {
		return is_active;
	}

	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}

}
