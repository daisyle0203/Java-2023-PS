package daointerface;

import model.Customer;

public interface CustomerDAO {
	Customer getCustomerById(int id);

	void addCustomer(Customer c);

	void removeCustomerById(int id);
}
