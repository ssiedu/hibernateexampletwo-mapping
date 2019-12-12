package com.ssi;

import org.hibernate.Session;

public class SearchCard {
	public static void main(String[] args) {
		//Query By Id to fetch the data from Card table "1111"
		
		Session session=Utility.getSessionFactory().openSession();
		Card card=session.get(Card.class, "1111");
		
		System.out.println(card.getCno());
		System.out.println(card.getCtype());
		System.out.println(card.getLimit());
		System.out.println(card.getAccount().getAno());
		System.out.println(card.getAccount().getCname());
		System.out.println();
		
		session.close();

	}

}
