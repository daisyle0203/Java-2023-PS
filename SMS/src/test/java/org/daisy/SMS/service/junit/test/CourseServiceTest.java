package org.daisy.SMS.service.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.daisy.SMS.model.Course;
import org.daisy.SMS.service.CourseService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CourseServiceTest {
	private CourseService courseService;

	@BeforeEach
	public void setup() {
		courseService = new CourseService();
	}

	@Test
	public void testGetAllCourses() {
		List<Course> result = courseService.getAllCourses();
		assertEquals(10, result.size()); 
		assertNotEquals(4, result.size());

	}
}
