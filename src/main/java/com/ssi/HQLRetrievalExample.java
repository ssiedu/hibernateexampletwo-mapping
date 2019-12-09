package com.ssi;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class HQLRetrievalExample {

	public static void main(String[] args) {
		//fetching data using HQL
		
		Session session=Utility.getSessionFactory().openSession();
		
		String hql="from Emp where sal>=80000";
		
		Query query=session.createQuery(hql);
		List<Emp> employees=query.list();
		
		
		for(Emp employee:employees){
			System.out.println(employee);
		}
		
		
		session.close();
	}

}
