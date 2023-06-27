package org.daisy.SMS.service;

import java.util.ArrayList;
import java.util.List;

import org.daisy.SMS.dao.StudentDAO;
import org.daisy.SMS.model.Course;
import org.daisy.SMS.model.Student;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class StudentService implements StudentDAO {

	public void createTables() {
		Transaction t = session.beginTransaction();

		Student s = new Student();
		Course c = new Course();

		t.commit();
		System.out.println("Successfully created Student and Course table");
		sessionFactory.close();
		session.close();
	}

	public List<Student> getAllStudents() {
		Query<Student> query = session.createQuery("FROM Student", Student.class);
		List<Student> results = query.getResultList();
		for (Student s : results) {
			System.out.println(s.getsName());
		}
		return results;

	}

	public Student getStudentByEmail(String sEmail) {
		Query<Student> query = session.createQuery("FROM Student WHERE sEmail = :sEmail", Student.class);
		query.setParameter("sEmail", sEmail);
		Student student = query.getSingleResult();
		System.out.println(student.getsName());
		return student;
	}

	public boolean validateStudent(String sEmail, String sPassword) {
		Query<Student> query = session.createQuery("FROM Student WHERE sEmail = :sEmail and sPassword = :sPassword",
				Student.class);
		query.setParameter("sEmail", sEmail);
		query.setParameter("sPassword", sPassword);
		
		Student result = query.getSingleResult();
		if (result != null) {
			System.out.println("Student " + result.getsEmail() + " is a valid user");
			return true;
		}
		return false;
	}

	
	public void registerStudentToCourse(String sEmail, int cId) {
		// Check if the student exists
		Query<Student> studentQuery = session.createQuery("FROM Student WHERE sEmail = :sEmail", Student.class);
		studentQuery.setParameter("sEmail", sEmail);
		Student student = studentQuery.getSingleResult();

		// Check if the course exists
		Query<Course> courseQuery = session.createQuery("FROM Course WHERE cId = :cId", Course.class);
		courseQuery.setParameter("cId", cId);
		Course course = courseQuery.getSingleResult();

		// Check if this student is already registered in this course
		if (student != null && course != null) {
			List<Course> courses = student.getsCourses();

			if (courses.contains(course)) {
				System.out.println("Student is already registered : " + cId);
				return;
			} else {
				Transaction t = session.beginTransaction();
				// if not registered already then register
				courses.add(course);
				student.setsCourses(courses);

				session.persist(student);
				t.commit();
				System.out.println(student.getsName() + " registered for course " + cId + " successfully!");

			}
		}

	}

	public List<Course> getStudentCourses(String sEmail) {
		List<Course> studentCourses = new ArrayList<Course>();

		// Check if the student exists
		Query<Student> studentQuery = session.createQuery("FROM Student WHERE sEmail = :sEmail", Student.class);
		studentQuery.setParameter("sEmail", sEmail);
		Student student = studentQuery.getSingleResult();
		
		studentCourses = student.getsCourses();
		return studentCourses;
	}

}
