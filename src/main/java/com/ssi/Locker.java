package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Locker {
	@Id
	private String lcode;
	private String ltype;
	private int rent;
	
	@ManyToOne
	private Account account;
	
	public Locker(String lcode) {
		super();
		this.lcode = lcode;
	}
	public Locker() {
		super();
	}
	public Locker(String lcode, String ltype, int rent) {
		super();
		this.lcode = lcode;
		this.ltype = ltype;
		this.rent = rent;
	}
	public String getLcode() {
		return lcode;
	}
	public void setLcode(String lcode) {
		this.lcode = lcode;
	}
	public String getLtype() {
		return ltype;
	}
	public void setLtype(String ltype) {
		this.ltype = ltype;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	@Override
	public String toString() {
		return "Locker [lcode=" + lcode + ", ltype=" + ltype + ", rent=" + rent
				+ "]";
	}
	public Locker(String lcode, String ltype, int rent, Account account) {
		super();
		this.lcode = lcode;
		this.ltype = ltype;
		this.rent = rent;
		this.account = account;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
