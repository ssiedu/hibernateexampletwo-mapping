package com.ssi;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class CacheDemo {

	public static void main(String[] args) {
		Configuration config=new Configuration().configure().addAnnotatedClass(Emp.class);
		Session session=config.buildSessionFactory().openSession();
		
		
		
		Emp emp1=session.get(Emp.class, 111);
		//here first hibernate will look into the cache
		//we are fetching it first time, so its not there in cache
		//it will run a SELECT query and will fetch the object from DB
		//will store that to cache
		//from cache the object will will be returned to us
		System.out.println(emp1);
		//session.evict(emp1);	//object go to ditached state (means removed from cache)
		
		Emp emp2=session.get(Emp.class, 111);
		System.out.println(emp2);
		
		
		
		session.close();

	}

}
