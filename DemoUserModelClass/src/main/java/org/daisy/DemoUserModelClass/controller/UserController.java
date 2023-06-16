package org.daisy.DemoUserModelClass.controller;

import java.util.List;

import org.daisy.DemoUserModelClass.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.TypedQuery;

public class UserController {

	public void createUser() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		User userOne = new User("yanzhi@gmail.com", "yanzhi", "123456", "123 st", "TX", "76010");
		User userTwo = new User("Sean@gmail.com", "Sean", "1234567", "123 st", "TX", "76010");
		User userThree = new User("Daisy@gmail.com", "Daisy", "12345678", "123 st", "TX", "76010");
		User userFour = new User("Skyler@gmail.com", "Skyler", "123456789", "123 st", "TX", "76010");
		session.persist(userOne);
		session.persist(userTwo);
		session.persist(userThree);
		session.persist(userFour);
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();
	}

	public boolean login(String email, String password) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hqlStr = "from User";
		TypedQuery<User> query = session.createQuery(hqlStr, User.class);
		List<User> results = query.getResultList();
		for (User u : results) {
			if (email.equals(u.getEmail()) && password.equals(u.getPassword())) {
				System.out.println("login successfully");
				return true;
			}
		}
		System.out.println("wrong credentials");
		return false;
	}

	public User findByEmail(String email) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String stringHqlString = "FROM User WHERE email = :email";
		TypedQuery<User> query = session.createQuery(stringHqlString, User.class);
		query.setParameter("email", email);
		User user = query.getSingleResult();
		System.out.println(user.getName());
		return user;

	}

	public List<User> findByZipCode(String zipCode) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		TypedQuery<User> query = session.createQuery("FROM User WHERE zipCode = :zipCode", User.class);
		query.setParameter("zipCode", zipCode);
		List<User> results = query.getResultList();
		for (User u: results) {
			System.out.println(u.getName());
		}
		
		return results;
	}
}