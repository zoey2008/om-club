package com.om.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springside.examples.miniweb.entity.IdEntity;


@Entity
@Table(name = "t_account")
public class Account  extends IdEntity {
	 @ManyToOne
	 @JoinColumn(name="account_sale_id")  
 private AccountSale accountSale;
	 @ManyToOne
	 @JoinColumn(name="member_id")  
 private Member member;
 private int balance;
	@Temporal(TemporalType.TIMESTAMP)
 private Date expire;
 private int isactive;
public AccountSale getAccountSale() {
	return accountSale;
}
public void setAccountSale(AccountSale accountSale) {
	this.accountSale = accountSale;
}
public Member getMember() {
	return member;
}
public void setMember(Member member) {
	this.member = member;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public Date getExpire() {
	return expire;
}
public void setExpire(Date expire) {
	this.expire = expire;
}
public int getIsactive() {
	return isactive;
}
public void setIsactive(int isactive) {
	this.isactive = isactive;
}

 
}


 