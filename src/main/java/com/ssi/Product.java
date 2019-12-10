package com.ssi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Product {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@SequenceGenerator(name="productcode_gen",sequenceName="pcode_gen",allocationSize=1, initialValue=1001)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="productcode_gen" )
	
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@GeneratedValue(strategy=GenerationType.TABLE)
	private int pcode;
	private String pname;
	private int price;
	
	
	
	
	
	public Product() {
		super();
	}
	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pcode=" + pcode + ", pname=" + pname + ", price="
				+ price + "]";
	}
	
	
}
