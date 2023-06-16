package org.daisy.DemoUserModelClass.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.daisy.DemoUserModelClass.controller.UserController;
import org.junit.jupiter.api.Test;

class ControllerComplyTest {

	@Test
	void testLogin() {
		boolean expectedResult = true;
		UserController uController = new UserController();
		boolean actualResult = uController.login("test@test.com", "12345");
		assertEquals(expectedResult, actualResult, "Login failed!")
		System.out.println("Login");
	}

}
