package org.daisy.HibernateJPABeginner.controller;

import org.daisy.HibernateJPABeginner.model.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FindDepartment {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		int DEPARTMENT_ID = 2;
		Department d = session.get(Department.class, DEPARTMENT_ID);
		System.out.println("Name: " + d.getName());
		System.out.println("State: " + d.getState());


		// Close resources
		tx.commit();
		factory.close();
		session.close();
	}

}
