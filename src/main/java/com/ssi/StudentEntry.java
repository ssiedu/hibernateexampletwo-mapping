package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class StudentEntry {

	public static void main(String[] args) {
		Configuration config=new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();

		Student s1=new Student(new Name("Amit","Sharma"), "amits@gmail.com","9000078789", new Address("111","ABC Street","Indore"));
		Student s2=new Student(new Name("Amit","Jain"), "amitj@gmail.com","8008070070", new Address("222","XYZ Street","Delhi"));
		session.save(s1);
		session.save(s2);
		tr.commit();
		session.close();
		System.out.println("DATA STORED SUCCESSFULLY");
		
	}

}

//Ctr+Shf+O