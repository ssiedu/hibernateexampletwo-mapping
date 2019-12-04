package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class QBCFilteration {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Emp.class);
		
		Criterion crt1=Restrictions.ge("sal", 50000);
		Criterion crt2=Restrictions.eq("address.city", "Mumbai");
		Criterion crt3=Restrictions.or(crt1,crt2);
		
		
		//criteria.add(crt1);
		//criteria.add(crt2);
		criteria.add(crt3);
		List<Emp> employees=criteria.list();
		
		for(Emp emp:employees){
			System.out.println(emp);
			System.out.println("______________________________________________");
		}
		
		
		session.close();

	}

}
