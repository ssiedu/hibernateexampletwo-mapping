package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CardEntry {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(new Card("1111","Gold",50000));
		session.save(new Card("2222","Silver",35000));
		session.save(new Card("3333","Platinum",75000));
		
		
		tr.commit();
		session.close();
		System.out.println("Card Details Stored");
	}

}
