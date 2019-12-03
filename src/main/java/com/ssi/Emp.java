package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	private int ecode;
	private String ename;
	private int sal;
	private Address address;
	
	public int getEcode() {
		return ecode;
	}
	public void setEcode(int ecode) {
		this.ecode = ecode;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Emp(int ecode, String ename, int sal) {
		super();
		this.ecode = ecode;
		this.ename = ename;
		this.sal = sal;
	}
	public Emp() {
		super();
	}
	public Emp(int ecode, String ename, int sal, Address address) {
		super();
		this.ecode = ecode;
		this.ename = ename;
		this.sal = sal;
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [ecode=" + ecode + ", ename=" + ename + ", sal=" + sal
				+ ", address=" + address + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
