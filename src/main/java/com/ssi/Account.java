package com.ssi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Account {
	@Id
	private int ano;
	private String cname;
	private int balance;
	
	@OneToOne
	private Card card;
	
	@OneToMany(mappedBy="account")
	private List<Locker> lockers;
	
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
	public Account(int ano, String cname, int balance, Card card,
			List<Locker> lockers) {
		super();
		this.ano = ano;
		this.cname = cname;
		this.balance = balance;
		this.card = card;
		this.lockers = lockers;
	}
	public List<Locker> getLockers() {
		return lockers;
	}
	public void setLockers(List<Locker> lockers) {
		this.lockers = lockers;
	}
	public Account(int ano) {
		super();
		this.ano = ano;
	}
	
	
}
