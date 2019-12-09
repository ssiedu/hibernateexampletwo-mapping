package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateMethodExample {

	public static void main(String[] args) {
		
		Session session=Utility.getSessionFactory().openSession();
		//change the sal of eno=100 to 95000
		
		/*Emp emp=new Emp();
		emp.setEcode(100);
		emp.setSal(95000);*/
		
		//Emp emp=new Emp();
		//emp.setEcode(112);
		
		Emp emp=session.get(Emp.class, 112);
		//System.out.println(emp);
		emp.setSal(65000);
		//System.out.println(emp);
		
		
		Transaction tr=session.beginTransaction();
		session.update(emp);
		
		tr.commit();
		session.close();
		System.out.println("Updation Peformed");
		
	}

}
