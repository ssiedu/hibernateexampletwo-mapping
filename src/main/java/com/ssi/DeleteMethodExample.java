package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteMethodExample {

	public static void main(String[] args) {
		
		Session session=Utility.getSessionFactory().openSession();
		//deleting a record with ecode=113
		
		Emp emp=new Emp();
		emp.setEcode(113);
		
		Transaction tr=session.beginTransaction();
		session.delete(emp);
		tr.commit();
		
		System.out.println("Record Deleted");
		
		
		session.close();
		
	}

}
