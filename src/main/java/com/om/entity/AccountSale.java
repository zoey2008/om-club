package com.om.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springside.examples.miniweb.entity.IdEntity;


@Entity
@Table(name = "t_account_sale")
public class AccountSale  extends IdEntity {
	 @ManyToOne
	 @JoinColumn(name="sale_type_id")  
 private SaleType saleType;
	 @ManyToOne
	 @JoinColumn(name="account_type_id")  
 private AccountType accountType;
 private String name;
 private int cash_amount;
 private int real_amount;
 private String descs;
 
public SaleType getSaleType() {
	return saleType;
}
public void setSaleType(SaleType saleType) {
	this.saleType = saleType;
}
public AccountType getAccountType() {
	return accountType;
}
public void setAccountType(AccountType accountType) {
	this.accountType = accountType;
}
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
public String getDescs() {
	return descs;
}
public void setDescs(String descs) {
	this.descs = descs;
}
 
 
}

