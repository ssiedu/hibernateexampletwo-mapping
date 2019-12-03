package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class SearchEmp {
	public static void main(String args[]){

	//Query By Id	(QBI)
	Configuration config=new Configuration().configure().addAnnotatedClass(Emp.class);
	Session session=config.buildSessionFactory().openSession();
	
	//Emp emp=session.get(Emp.class, 111);
	
	Emp emp=session.load(Emp.class, 111);
	
	String name=emp.getEname();
	int sal=emp.getSal();
	//Address adr=emp.getAddress();
	//String city=adr.getCity();
	String city=emp.getAddress().getCity();
	
	
	
	System.out.println(name);
	System.out.println(sal);
	System.out.println(city);
	//System.out.println(emp);
	
	
	session.close();
}

}
