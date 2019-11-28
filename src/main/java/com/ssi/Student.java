package com.ssi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="studinfo")
public class Student {
	
	@Id
	@Column(name="rollno")
	private int rno;
	
	@Column(name="studname")
	private String name;
	
	@Column(name="cellno")
	private String mobile;
	
	@Column(name="mailid")
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
