package com.ssi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class HQLParameterExample {

	public static void main(String[] args) {
		
		Session session=Utility.getSessionFactory().openSession();
		
		//String hql="from Emp where sal>:salvalue";
		String hql="from Emp where sal between :lowvalue and :highvalue";
		Query query=session.createQuery(hql);
		//query.setParameter("salvalue", 70000);
		query.setParameter("lowvalue", 60000);
		query.setParameter("highvalue", 90000);
		
		List<Emp> employees=query.list();
		for(Emp emp:employees){
			System.out.println(emp);
		}
		session.close();
	}

}
