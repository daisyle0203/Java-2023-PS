package org.daisy.SMS.service;

import java.util.List;

import org.daisy.SMS.dao.CourseDAO;
import org.daisy.SMS.model.Course;
import org.hibernate.query.Query;

public class CourseService implements CourseDAO {
	public List<Course> getAllCourses() {
		Query<Course> query = session.createQuery("FROM Course", Course.class);
		List<Course> results = query.getResultList();
		for (Course c : results) {
			System.out.println(c.getcName());
		}
		return results;

	}

}
