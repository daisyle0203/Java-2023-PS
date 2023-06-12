package daointerface;

import java.sql.SQLException;

import model.Customer;

public interface CustomerDAO {
	Customer getCustomerById(int id)  throws ClassNotFoundException, SQLException;

	void addCustomer(Customer c);

	boolean removeCustomerById(int id);
}
