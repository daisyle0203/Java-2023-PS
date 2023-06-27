package org.daisy.SMS;

import java.util.List;
import java.util.Scanner;

import org.daisy.SMS.model.Course;
import org.daisy.SMS.service.CourseService;
import org.daisy.SMS.service.StudentService;

public class App {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		CourseService courseService = new CourseService();
//		studentService.createTables();
//		studentService.getAllStudents();
//		studentService.getStudentByEmail("aiannitti7@is.gd");
//		studentService.validateStudent("cjaulme9@bing.com", "FnVklVgC6r6");
//		studentService.registerStudentToCourse("aiannitti7@is.gd", 1);
//		studentService.getStudentCourses("aiannitti7@is.gd");
//		courseService.getAllCourses();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Are you a(n)");
		System.out.println("1. Student");
		System.out.println("2. quit");
		System.out.print("Please, enter 1 or 2: ");
		int choice = scanner.nextInt();

		if (choice == 1) {
			scanner.nextLine();
			System.out.print("Enter Your Email: ");
			String email = scanner.nextLine();
			System.out.print("Enter Your Password: ");
			String password = scanner.nextLine();

			if (studentService.validateStudent(email, password)) {
				List<Course> studentCourses = studentService.getStudentCourses(email);

				if (studentCourses.size() > 0) {

					System.out.println("My Classes:");
					System.out.println("Id ||" + " Course Name||" + " Course Instructor");

					for (Course courses : studentCourses) {

						System.out.println(courses.getcId() + "||" + " " + courses.getcName() + "||" + " "
								+ courses.getcInstructorName());

					}
				}

				else {
					System.out.println("You are not enrolled for any class currently");
				}
				System.out.println();
				System.out.println("What do you want to do next?");
				System.out.println("1. Register to Class");
				System.out.println("2. Logout");
				int studentChoice = scanner.nextInt();

				if (studentChoice == 1) {
					List<Course> allCourses = courseService.getAllCourses();

					System.out.println("Id ||" + " Course Name||" + " Course Instructor");
					for (Course courses : allCourses) {

						System.out.println(courses.getcId() + " ||" + " " + courses.getcName() + "||" + " "
								+ courses.getcInstructorName());
					}

					System.out.print("Which Course? ");
					int courseId = scanner.nextInt();

					studentService.registerStudentToCourse(email, courseId);
					studentCourses = studentService.getStudentCourses(email);

					if (studentCourses.size() > 0) {

						System.out.println("My Classes:");
						System.out.println("Id ||" + " Course Name||" + " Course Instructor");

						for (Course courses : studentCourses) {

							System.out.println(courses.getcId() + " ||" + " " + courses.getcName() + "||" + " "
									+ courses.getcInstructorName());

						}
					}

					System.out.println("You have been signed out.");
					System.exit(0);
				} else if (studentChoice == 2) {
					System.out.println("You have been signed out.");
					System.exit(0);
				}
			} else {
				System.out.println("Wrong Credentials");
				System.exit(0);
			}
		} else if (choice == 2) {
			System.out.println("Goodbye!");
			System.exit(0);
		}

		scanner.close();
	}
}
