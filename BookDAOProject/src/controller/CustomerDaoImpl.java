package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import daointerface.ConnectionDAO;
import daointerface.CustomerDAO;
import model.Customer;

public class CustomerDaoImpl implements CustomerDAO {
	public CustomerDaoImpl() throws ClassNotFoundException {
	}

	Connection con = ConnectionDAO.getConnection();

	@Override
	public Customer getCustomerById(int id) {
		Customer customer = null;
		try {
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM Customer Where id = ?";
			ResultSet rs = stmt.executeQuery(query);
			if (rs.next()) {
				customer = new Customer();
				customer.setId(rs.getInt("id"));
				customer.setFname(rs.getString("Fname"));
				customer.setLname(rs.getString("Lname"));
				customer.setEmail(rs.getString("email"));
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
		}
		return customer;
	}

	@Override
	public void addCustomer(Customer c) {
		try {
			String query = "INSERT INTO customers (id, fname, lname, email) VALUES (?, ?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, c.getId());
			stmt.setString(2, c.getFname());
			stmt.setString(3, c.getLname());
			stmt.setString(4, c.getEmail());
			// Set other customer properties as needed
			stmt.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
		}

	}

	@Override
	public boolean removeCustomerById(int id) {
		try {
			String query = "DELETE FROM customers WHERE id = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, id);
			int i = stmt.executeUpdate();
			if (i == 1) {
				return true;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
		}
		return false;
	}

}
