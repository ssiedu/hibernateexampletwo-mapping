package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class QBCProjectionDemoTwo {
	public static void main(String args[]){

		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Emp.class);
		//fetch selected columns (more than 1)
		
		ProjectionList pList=Projections.projectionList();
		Projection pr1=Projections.property("ename");
		Projection pr2=Projections.property("sal");
		pList.add(pr1);
		pList.add(pr2);
		criteria.setProjection(pList);

		List<Object[]> list=criteria.list();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
