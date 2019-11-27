package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Student {
	@Id
	private int rno;
	private String name;
	private String mobile;
	private String email;
	
	public Student() {
		super();
	}
	public Student(int rno, String name, String mobile, String email) {
		super();
		this.rno = rno;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
}
