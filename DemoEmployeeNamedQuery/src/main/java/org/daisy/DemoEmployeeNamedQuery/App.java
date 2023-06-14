package org.daisy.DemoEmployeeNamedQuery;

import org.daisy.DemoEmployeeNamedQuery.controller.EmployeeController;

public class App {
	public static void main(String[] args) {
		EmployeeController e = new EmployeeController();
//		e.createEmployeeTable();
//		e.findEmployeeByName();
//		e.findEmployeeById();
		e.showOfficeCodes_AsDepartment();

	}
}
