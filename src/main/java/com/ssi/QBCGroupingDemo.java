package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class QBCGroupingDemo {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Emp.class);
		
		Projection proj1=Projections.groupProperty("address.city");
		Projection proj2=Projections.sum("sal");
		
		ProjectionList pList=Projections.projectionList();
		pList.add(proj1);
		pList.add(proj2);
		
		criteria.setProjection(pList);
		
		List<Object[]> list=criteria.list();
		

		for(Object objAr[]:list){
			for(Object item:objAr){
				System.out.println(item);
			}
			System.out.println("_________________________");
		}
		
		
		session.close();
	}

}
