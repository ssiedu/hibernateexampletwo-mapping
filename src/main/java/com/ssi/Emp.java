package com.ssi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Emp {
	@Id
	private int eno;	
	private String ename;
	@OneToOne(cascade=CascadeType.ALL)
	private Laptop laptop;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Emp(int eno, String ename, Laptop laptop) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.laptop = laptop;
	}
	public Emp() {
		super();
	}
	
}
