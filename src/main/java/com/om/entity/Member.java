package com.om.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springside.examples.miniweb.entity.IdEntity;

/**
 * 会员
 * @author zoey
 *
 */
@Entity
@Table(name = "t_member")

public class Member  extends IdEntity {
	@Column(name = "member_code", unique = true)
	private String code;
	private String name;
	private String cardno;
	private String tel;
	private String born;
	private String qq;
	private String weibo;
	private String email;
	private String trade_pass;
	private String login_pass;
	
	
	
	
	
	
	
	
	
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
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getBorn() {
		return born;
	}
	public void setBorn(String born) {
		this.born = born;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getWeibo() {
		return weibo;
	}
	public void setWeibo(String weibo) {
		this.weibo = weibo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTrade_pass() {
		return trade_pass;
	}
	public void setTrade_pass(String trade_pass) {
		this.trade_pass = trade_pass;
	}
	public String getLogin_pass() {
		return login_pass;
	}
	public void setLogin_pass(String login_pass) {
		this.login_pass = login_pass;
	}
	
	
	
	
	
}

 