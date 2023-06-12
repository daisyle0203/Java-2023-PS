package org.daisy.HibernateJPABeginner.controller;

import org.daisy.HibernateJPABeginner.model.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateDepartment {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Department d = new Department();
		d.setDid(1);
		d.setName("Services");
		d.setState("Alabama");
		session.merge(d);
		session.getTransaction().commit();
		session.close();
	}

}
