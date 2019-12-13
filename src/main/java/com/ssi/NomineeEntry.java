package com.ssi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class NomineeEntry {

	public static void main(String[] args) {
		
		List<Account> list1=new ArrayList<Account>();
		list1.add(new Account(5001));
		list1.add(new Account(5002));
		
		List<Account> list2=new ArrayList<Account>();
		list2.add(new Account(5002));
		list2.add(new Account(5003));
		
		List<Account> list3=new ArrayList<Account>();
		list3.add(new Account(5002));
		list3.add(new Account(5003));
		
		Nominee n1=new Nominee("N1","xyz",34,list1);
		Nominee n2=new Nominee("N2","pqr",31,list2);
		Nominee n3=new Nominee("N3","mno",44,list3);

		Session session=Utility.getSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(n1);
		session.save(n2);
		session.save(n3);
		tr.commit();
		session.close();
		System.out.println("Nominee Details Stored");
		
	}

}
