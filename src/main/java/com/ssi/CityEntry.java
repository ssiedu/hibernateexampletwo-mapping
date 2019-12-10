package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CityEntry {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		City c1=new City(); c1.setName("Indore");
		City c2=new City(); c2.setName("Bhopal");
		session.save(c1); session.save(c2);
		transaction.commit();
		session.close();
		System.out.println("DATA STORED");
	}

}
