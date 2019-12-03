package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpEntry {

	public static void main(String[] args) {
		Configuration config=new Configuration().configure().addAnnotatedClass(Emp.class);
		Session session=config.buildSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		Emp e1=new Emp(111,"AAA",50000, new Address("501","ABRoad","Indore"));	
		Emp e2=new Emp(112,"BBB",60000, new Address("902","MGRoad","Bhopal"));
		Emp e3=new Emp(113,"CCC",70000, new Address("545","XyzStreet","Delhi"));
		session.save(e1); session.save(e2); session.save(e3);
		tr.commit();
		session.close();	
		System.out.println("Emp Data Stored");
		

	}

}
