package org.daisy.SMS.service.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.daisy.SMS.model.Course;
import org.daisy.SMS.model.Student;
import org.daisy.SMS.service.CourseService;
import org.daisy.SMS.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentServiceTest {
	private StudentService studentService;
	private CourseService courseService;

	@BeforeEach
	public void setup() {
		// Initializing Service objects
		studentService = new StudentService();
		courseService = new CourseService();
	}

	@Test
	public void testGetAllStudents() {
		List<Student> students = studentService.getAllStudents();

		// Asserting that the list of students is not null
		// There are 10 students in the database
		assertEquals(10, students.size()); 
		assertNotEquals(4, students.size());
	}

	@Test
	public void testValidateStudent() {
		String email = "aiannitti7@is.gd";
		String password = "TWP4hf5j";
		boolean isValid = studentService.validateStudent(email, password);

		// Asserting that the student with the given email and password is valid
		assertEquals(true, isValid);
	}

	@Test
	public void testGetStudentCourses() {
		String email = "aiannitti7@is.gd";
		String email1 = "cstartin3@flickr.com";
		List<Course> studentCourses = studentService.getStudentCourses(email);
		List<Course> studentCourses1 = studentService.getStudentCourses(email1);

		// Assert that the list of student courses is not null
		assertEquals(0, studentCourses.size());
		assertNotEquals(0, studentCourses1.size());
	}

	@Test
	public void testGetAllCourses() {
		List<Course> courses = courseService.getAllCourses();
		
		// Assert that the list of courses is not null
		assertEquals(10, courses.size());
		assertNotEquals(2, courses.size());
	}
}
