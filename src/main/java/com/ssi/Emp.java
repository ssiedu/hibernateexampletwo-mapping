package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	private int ecode;
	private String ename;
	private int sal;
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
	
}
