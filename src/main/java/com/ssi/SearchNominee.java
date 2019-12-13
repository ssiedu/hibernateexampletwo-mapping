package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class SearchNominee {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Nominee nominee=session.get(Nominee.class, "N2");
		
		System.out.println(nominee.getNcode());
		System.out.println(nominee.getName());
		System.out.println(nominee.getAge());
		List<Account> accounts=nominee.getAccounts();
		for(Account account:accounts){
			System.out.println(account.getAno()+","+account.getCname());
		}
		
		session.close();

	}

}
