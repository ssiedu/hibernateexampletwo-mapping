package com.ssi;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class QBCAggregationDemo {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Emp.class);
		
		/*//Fetching sum,avg both
		
		Projection proj1=Projections.sum("sal");
		Projection proj2=Projections.avg("sal");
		Projection proj3=Projections.max("sal");
		Projection proj4=Projections.min("sal");
		
		ProjectionList pL=Projections.projectionList();
		pL.add(proj1); pL.add(proj2); pL.add(proj3); pL.add(proj4);
		
		criteria.setProjection(pL);
		
		Object objects[]=(Object[])criteria.uniqueResult();
		
		for(Object obj:objects){
			System.out.println(obj);
		}
		
*/		
		
		
		/*		
		//Fetching only sum
		Projection proj1=Projections.sum("sal");
		criteria.setProjection(proj1);
		
		long res1=(Long)criteria.uniqueResult();
		System.out.println(res1*12);
		*/
		
		/*
	 	//Fetching only avg
	
		Projection proj1=Projections.avg("sal");
		criteria.setProjection(proj1);
		
		double res1=(Double)criteria.uniqueResult();
		System.out.println(res1);*/
		
		
		session.close();
	}

}
