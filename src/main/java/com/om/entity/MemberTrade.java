package com.om.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.om.framework.entity.IdEntity;


@Entity
@Table(name = "t_member_trade")
public class MemberTrade extends IdEntity {
	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member member;
	@ManyToOne
	@JoinColumn(name = "goods_id")
	private Goods goods;
	private int trade_size;
	private int trade_amount;
	@Temporal(TemporalType.TIMESTAMP)
	private Date trade_time;
	private int trade_balance;
	@ManyToOne
	@JoinColumn(name = "account_id")
	private Account account;

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public int getTrade_size() {
		return trade_size;
	}

	public void setTrade_size(int trade_size) {
		this.trade_size = trade_size;
	}

	public int getTrade_amount() {
		return trade_amount;
	}

	public void setTrade_amount(int trade_amount) {
		this.trade_amount = trade_amount;
	}

	public Date getTrade_time() {
		return trade_time;
	}

	public void setTrade_time(Date trade_time) {
		this.trade_time = trade_time;
	}

	public int getTrade_balance() {
		return trade_balance;
	}

	public void setTrade_balance(int trade_balance) {
		this.trade_balance = trade_balance;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
