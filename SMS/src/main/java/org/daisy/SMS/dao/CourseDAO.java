package org.daisy.SMS.dao;

import java.util.List;

import org.daisy.SMS.model.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public interface CourseDAO {
	final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	final Session session = sessionFactory.openSession();

	List<Course> getAllCourses();
}
