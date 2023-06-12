package runner;

import java.util.ArrayList;

import model.Customer;

public class AccessCustomer {

	public static void main(String[] args) {
		// creating customer object
		CustomerDAO customerDao = new CustomerDaoImpl();
		System.out.println("--------- inserting customer records ----------");

		ArrayList<Customer> CustomerList = new ArrayList<Customer>();

		Customer c1 = new Customer();
		c1.setFname("Alex");
		c1.setLname("Wick");
		c1.setEmail("alex@test.com");
		CustomerList.add(c1);
	}

}
