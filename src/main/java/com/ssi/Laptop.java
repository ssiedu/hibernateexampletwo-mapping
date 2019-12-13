package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	private String lcode;
	private String brand;
	private int price;
	@OneToOne(mappedBy="laptop")
	private Emp emp;
	public String getLcode() {
		return lcode;
	}
	public void setLcode(String lcode) {
		this.lcode = lcode;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	public Laptop(String lcode, String brand, int price) {
		super();
		this.lcode = lcode;
		this.brand = brand;
		this.price = price;
	}
	public Laptop() {
		super();
	}
	
}
