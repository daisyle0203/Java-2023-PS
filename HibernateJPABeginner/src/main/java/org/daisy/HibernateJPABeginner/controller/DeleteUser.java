package org.daisy.HibernateJPABeginner.controller;

import org.daisy.HibernateJPABeginner.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteUser {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		User u = new User();
		u.setId(3);
		session.remove(u);
		tx.commit();
		session.close();
		factory.close();
	}
}
