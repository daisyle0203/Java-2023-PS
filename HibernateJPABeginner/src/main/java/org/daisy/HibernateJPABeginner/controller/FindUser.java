package org.daisy.HibernateJPABeginner.controller;

import org.daisy.HibernateJPABeginner.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FindUser {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		int USER_ID = 2;
		User u = session.get(User.class, USER_ID);
		System.out.println("Fullname: " + u.getfullName());
		System.out.println("Email: " + u.getEmail());
		System.out.println("password: " + u.getPassword());

		// Close resources
		tx.commit();
		factory.close();
		session.close();
	}
}
