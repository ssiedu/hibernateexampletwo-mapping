package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class QBCExampleOne {

	public static void main(String[] args) {

		Session session=Utility.getSessionFactory().openSession();
		@SuppressWarnings("deprecation")
		Criteria criteria=session.createCriteria(Emp.class);
		
		Order order1=Order.asc("address.city");
		//Order order1=Order.asc("address.hno");
		//Order order2=Order.asc("ecode");
		
		criteria.addOrder(order1);
		//criteria.addOrder(order2);
		
		List<Emp> employees=criteria.list();
		
		for(Emp emp:employees){
			System.out.println(emp);
			/*System.out.println(emp.getEcode());
			System.out.println(emp.getEname());
			System.out.println(emp.getSal());
			System.out.println(emp.getAddress());*/
			System.out.println("______________________________________________");
		}
		
		
		session.close();
	}

}
