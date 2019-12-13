package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpEntry {

	public static void main(String[] args) {
		
		Session session=Utility.getSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		Emp emp=new Emp(111,"ABC", new Laptop("L111","Dell",50000));
		session.persist(emp);
		tr.commit();
		session.close();

	}

}
