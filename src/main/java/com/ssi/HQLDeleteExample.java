package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class HQLDeleteExample {

	public static void main(String[] args) {

		Session session=Utility.getSessionFactory().openSession();
		String hql="delete from Emp where sal<50000";
		Query query=session.createQuery(hql);
		Transaction tr=session.beginTransaction();
		int n=query.executeUpdate();
		tr.commit();
		session.close();
		System.out.println(n+" Record Deleted");
		

	}

}
