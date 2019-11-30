package com.ssi;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity		//class level

public class Customer implements Serializable {
	
	@Id
	private String fname;
	@Id
	private String lname;
	
	private Address address;
	
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
	
	
	
	public Customer(String fname, String lname, Address address) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Customer() {
		super();
	}
	
}
