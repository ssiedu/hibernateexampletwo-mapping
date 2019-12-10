package com.ssi;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProductEntry {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name=sc.next();
		System.out.println("Enter Price : ");
		int price=sc.nextInt();
		
		Product product=new Product(name,price);
		
		Session session=Utility.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		session.save(product);
		transaction.commit();
		session.close();
		System.out.println("DATA STORED");
		
	}

}
