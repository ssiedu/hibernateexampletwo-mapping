package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class SearchLocker {
	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Locker locker=session.get(Locker.class, "L1001");
		
		System.out.println(locker.getLcode());
		System.out.println(locker.getLtype());
		System.out.println(locker.getRent());
		System.out.println(locker.getAccount().getAno());
		System.out.println(locker.getAccount().getCname());
		session.close();

	}
}
