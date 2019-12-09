package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class HQLUpdateExample {

	public static void main(String[] args) {

		String hql="update Emp set ename='Rajeev' where sal=95000";
		Session session=Utility.getSessionFactory().openSession();
		
		Query query=session.createQuery(hql);
		
		Transaction tr=session.beginTransaction();
		int n=query.executeUpdate();
		tr.commit();
		
		System.out.println(n+" row modified");
		
		session.close();

	}

}
