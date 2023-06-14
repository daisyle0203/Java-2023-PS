package org.daisy.HibernateJPABeginner.controller;

import java.util.List;
import org.daisy.HibernateJPABeginner.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import jakarta.persistence.TypedQuery;
import org.hibernate.query.Query;

public class FindUser_Hql {
	public void findUser() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = "FROM User"; // Example of HQL to get all records of user class
		TypedQuery<User> query = session.createQuery(hql, User.class);
		List<User> results = query.getResultList();
		for (User u : results) {
			System.out.println("User Id: " + u.getId() + "|" + " Full name:" + u.getfullName() + "|" + "Email: "
					+ u.getEmail() + "|" + "password" + u.getPassword());
		}
	}

	public void findUserSelect() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		/* ------------ Example of HQL to get all the records------- */
		String hql = "SELECT u FROM User u";
		Query<User> query = session.createQuery(hql, User.class);
		List<User> list = query.getResultList();

		for (User u : list) {
			System.out.println("User Id: " + u.getId() + "|" + " Full name:" + u.getfullName() + "|" + "Email: "
					+ u.getEmail() + "|" + "password" + u.getPassword());

		}
	}

	public void getRecordbyId() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = "FROM User E WHERE E.id > 2 ORDER BY E.salary DESC";
		TypedQuery<User> query = session.createQuery(hql, User.class);
		List<User> results = query.getResultList();
		for (User u : results) {
			System.out.println("User Id: " + u.getId() + "|" + " Full name:" + u.getfullName() + "|" + "Email: "
					+ u.getEmail() + "|" + "password" + u.getPassword());
		}
	}

	public void getRecords() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		TypedQuery<Object[]> queryy = session.createQuery("SELECT U.salary, U.fullName FROM User AS U", Object[].class);
		List<Object[]> results = queryy.getResultList();
		for (Object[] a : results) {
			System.out.println("Salary: " + a[0] + ", City: " + a[1]);
		}
	}

	public void getMaxSalary() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = "SELECT max(U.salary) FROM User U";
		TypedQuery<Double> query = session.createQuery(hql, Double.class);
		double result = (Double) query.getSingleResult();// return an object
		System.out.println(result);
	}

	public void getMaxSalaryGroupBy() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = "SELECT SUM(U.salary), U.city FROM User U GROUP BY U.city";
		TypedQuery<Object[]> query = session.createQuery(hql, Object[].class);
		List<Object[]> result = query.getResultList();
		for (Object[] o : result) {
			System.out.println("Total salary " + o[0] + " | city: " + o[1]);
		}
	}

	public void namedQueryExample() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = "FROM User u WHERE u.id = :id";
		TypedQuery<User> query = session.createQuery(hql, User.class);
		query.setParameter("id", 2);
		List<User> result = query.getResultList();
		for (User u : result) {
			System.out.println("User Id: " + u.getId() + "|" + " Full name:" + u.getfullName() + "|" + "Email: "
					+ u.getEmail() + "|" + "password" + u.getPassword());
		}

	}

}
