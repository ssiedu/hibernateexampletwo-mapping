package com.ssi;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account {
	@Id
	private int ano;
	private String cname;
	private int balance;
	
	@OneToOne(fetch=FetchType.LAZY)
	private Card card;
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public Account(int ano, String cname, int balance, Card card) {
		super();
		this.ano = ano;
		this.cname = cname;
		this.balance = balance;
		this.card = card;
	}
	public Account(){}
	@Override
	public String toString() {
		return "Account [ano=" + ano + ", cname=" + cname + ", balance="
				+ balance + ", card=" + card + "]";
	}
	
	
}
