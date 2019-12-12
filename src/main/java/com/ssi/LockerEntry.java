package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class LockerEntry {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(new Locker("L1001","Small",5000, new Account(5001)));
		session.save(new Locker("L1002","Medium",6000, new Account(5001)));
		session.save(new Locker("L1003","Large",7000, new Account(5002)));
		session.save(new Locker("L1004","Small",5000, new Account(5002)));
		session.save(new Locker("L1005","Medium",6000, new Account(5003)));
		session.save(new Locker("L1006","Large",7000, new Account(5003)));
		
		
		tr.commit();
		session.close();
		System.out.println("Locker Details Stored");
	}

}
