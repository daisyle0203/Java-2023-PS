package org.daisy.HibernateJPABeginner.controller;

import org.daisy.HibernateJPABeginner.model.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateDepartment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
		Department done = new Department();
		done.setName("HR");
		done.setState("Texas");
		
		/* ========= We can pass value/data by using constructor ========= */
		Department dtwo = new Department("Customer Service", "New York");
		Department dthree = new Department("Engineering", "Oklahoma");
	
		session.persist(done);
		session.persist(dtwo);
		session.persist(dthree);

		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();
	}

}
