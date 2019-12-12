package com.ssi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AccountEntry {

	public static void main(String[] args) {

		Session session=Utility.getSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		
	/*	List<Locker> list1=new ArrayList<Locker>();
		list1.add(new Locker("L1001"));
		list1.add(new Locker("L1002"));
		
		List<Locker> list2=new ArrayList<Locker>();
		list2.add(new Locker("L1003"));
		list2.add(new Locker("L1004"));
		
		List<Locker> list3=new ArrayList<Locker>();
		list3.add(new Locker("L1005"));
		list3.add(new Locker("L1006"));*/
		
		Account ac1=new Account(5001, "ABC", 25000, new Card("1111"));
		Account ac2=new Account(5002, "DEF", 35000, new Card("2222"));
		Account ac3=new Account(5003, "GHI", 45000, new Card("3333"));
		
		session.save(ac1); session.save(ac2); session.save(ac3);
		
		tr.commit();
		session.close();
		System.out.println("Accounts Details Stored");

	}

}
