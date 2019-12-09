package com.ssi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class HQLRetrievalProjectionExample {
	public static void main(String[] args) {
		//fetching data using HQL
		
		Session session=Utility.getSessionFactory().openSession();
		
		//String hql="select ename,sal from Emp";
		String hql="select SUM(sal), AVG(sal) from Emp";
		
		Query query=session.createQuery(hql);
		List<Object[]> employees=query.list();
		
		
		for(Object ar[]:employees){
			for(Object obj:ar){
				System.out.println(obj);
			}
			System.out.println("______________________________");
		}
		
		
		session.close();
	}
}
