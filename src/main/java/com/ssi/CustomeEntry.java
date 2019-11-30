package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomeEntry {
	
	public static void main(String args[]){
		
	
	Configuration config=new Configuration().configure();
	SessionFactory sessionFactory=config.buildSessionFactory();
	Session session=sessionFactory.openSession();
	
	Transaction tr=session.beginTransaction();
	
	Customer c1=new Customer("Amit","Jain",new Address("123","ABRoad","Indore"));
	
	Customer c2=new Customer("Raj","Jain", new Address("223","MGRoad","Bhopal"));
	
	session.save(c1);
	session.save(c2);
	
	tr.commit();
	
	session.close();
	System.out.println("Customer Objects Stored");
	
	}
	
	
}
