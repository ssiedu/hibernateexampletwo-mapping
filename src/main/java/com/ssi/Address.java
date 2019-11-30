package com.ssi;

import javax.persistence.Embeddable;




@Embeddable
public class Address {

	private String hno;
	private String street;
	private String city;
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String hno, String street, String city) {
		super();
		this.hno = hno;
		this.street = street;
		this.city = city;
	}
	public Address() {
		super();
	}
	
	
	
}
