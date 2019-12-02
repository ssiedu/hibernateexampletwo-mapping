package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpEntry {

	public static void main(String[] args) {
		Configuration config=new Configuration().configure().addAnnotatedClass(Emp.class);
		Session session=config.buildSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		Emp e1=new Emp(111,"AAA",50000);	//transient state (no dirty checking)
		
		session.save(e1);	//its in persistent state (hibernate will start trecking them for dirty checking)
		
		
		e1.setSal(55000);
		
		tr.commit();
		
		//session.evict(e1);
		session.clear();
		
		
		e1.setSal(60000);
		
		//tr.commit();
		session.close();	//all the objects which was in persistent state will be not in detached state
							//hibernate will stop trecking them from dirty checking.
		
	
		
		
		System.out.println("Emp Data Stored");
		

	}

}
