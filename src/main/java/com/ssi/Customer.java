package com.ssi;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer implements Serializable {
	
	@Id
	private String fname;
	
	@Id
	private String lname;
	
	private String address;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customer(String fname, String lname, String address) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}
	public Customer() {
		super();
	}
	
}
