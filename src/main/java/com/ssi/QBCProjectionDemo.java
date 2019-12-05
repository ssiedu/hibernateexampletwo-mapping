package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class QBCProjectionDemo {

	public static void main(String[] args) {
		
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Emp.class);
		Projection pr1=Projections.property("ename");
		criteria.setProjection(pr1);
		
		List<String> list=criteria.list();
		
		for(String s:list){
			System.out.println(s);
		}

		
		
/*		Criteria criteria=session.createCriteria(Emp.class);
		Projection pr1=Projections.property("ecode");
		criteria.setProjection(pr1);
		
		List<Integer> list=criteria.list();
		
		for(Integer s:list){
			System.out.println(s);
		}
*/		session.close();

	}

}
