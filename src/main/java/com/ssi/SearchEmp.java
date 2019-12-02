package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SearchEmp {
	public static void main(String args[]){
		
	Configuration config=new Configuration().configure().addAnnotatedClass(Emp.class);
	Session session=config.buildSessionFactory().openSession();
	
	Emp emp=session.get(Emp.class, 112);

	System.out.println(emp.getEcode());
	System.out.println(emp.getEname());
	System.out.println(emp.getSal());
	
	session.close();
}

}
