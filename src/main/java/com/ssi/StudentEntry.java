package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentEntry {

	public static void main(String[] args) {
		Configuration config=new Configuration().configure();
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Student student=new Student(111,"AAA","9090933445","abc@gmail.com");
		Transaction tr=session.beginTransaction();
		session.save(student);
		tr.commit();
		session.close();
		System.out.println("DATA STORED SUCCESSFULLY");
		
	}

}

//Ctr+Shf+O