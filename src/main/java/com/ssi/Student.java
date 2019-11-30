package com.ssi;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
public class Student {
	
	@EmbeddedId
	//@Id
	private Name name;
	private String email;
	private String mobile;
	private Address address;
	
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student(Name name, String email, String mobile, Address address) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
	
	
}


/*

@Entity
@Table(name="studinfo")
public class Student {
	
	//private int semester;
	@Transient
	private  String University="DAVV";
	
	private Address address;
	
	@Id
	@Column(name="rollno")
	private int rno;
	
	@Column(name="studname", nullable=false, length=50)
	private String name;
	
	@Column(name="cellno", length=16)
	private String mobile;
	
	@Transient
	@Column(name="mailid", length=256)
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
*/