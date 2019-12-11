package com.ssi;

import org.hibernate.Session;

public class SearchAccount {

	public static void main(String[] args) {
		//Query By Id to fetch the data from Accounts table 5001
		
		Session session=Utility.getSessionFactory().openSession();
		Account account=session.get(Account.class, 5001);
		
		System.out.println(account.getAno());
		System.out.println(account.getCname());
		System.out.println("Now We Ask Hibernate For Card Details : ");
		System.out.println(account.getCard());
		
		session.close();

	}

}
