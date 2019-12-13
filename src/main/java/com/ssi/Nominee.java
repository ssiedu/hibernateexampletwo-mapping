package com.ssi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Nominee {
	@Id
	private String ncode;
	private String name;
	private int age;
	@ManyToMany
	private List<Account> accounts;
	public String getNcode() {
		return ncode;
	}
	public void setNcode(String ncode) {
		this.ncode = ncode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	public Nominee(String ncode, String name, int age, List<Account> accounts) {
		super();
		this.ncode = ncode;
		this.name = name;
		this.age = age;
		this.accounts = accounts;
	}
	public Nominee() {
		super();
	}
	public Nominee(String ncode) {
		super();
		this.ncode = ncode;
	}
	@Override
	public String toString() {
		return "Nominee [ncode=" + ncode + ", name=" + name + ", age=" + age
				+ "]";
	}
	
	
	
	
}
