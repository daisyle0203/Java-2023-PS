package org.daisy.HibernateJPABeginner;

import org.daisy.HibernateJPABeginner.controller.*;


public class App {
	public static void main(String[] args) {
		FindUser_Hql u = new FindUser_Hql(); // create a FindUser_Hql object
//		u.findUser(); // call the findUser method
//		u.findUserSelect();
//		u.getRecordbyId();
//		u.getRecords();
//		u.getMaxSalary();
//		u.getMaxSalaryGroupBy();
		u.namedQueryExample();

	}
}
