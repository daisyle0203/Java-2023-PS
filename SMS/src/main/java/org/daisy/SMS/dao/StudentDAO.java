package org.daisy.SMS.dao;

import java.sql.SQLException;
import java.util.List;
import org.daisy.SMS.model.Course;
import org.daisy.SMS.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public interface StudentDAO {

	final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	final Session session = sessionFactory.openSession();

	List<Student> getAllStudents() throws ClassNotFoundException, SQLException;

	Student getStudentByEmail(String sEmail);

	boolean validateStudent(String sEmail, String sPassword);

	void registerStudentToCourse(String sEmail, int cId);

	List<Course> getStudentCourses(String sEmail);

}
