package jdbc;

import java.sql.*;

public class UpdatePrepareStExample {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement prepStmt = null;
		ResultSet rs = null;
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "E%$88$5hM";
		try {
			con = DriverManager.getConnection(dburl, user, password);
			System.out.println("Connection established successfully!");
//			String sql = "select * from employees where officeCode IN (?,?)";
//
//			prepStmt = con.prepareStatement(sql);
//			prepStmt.setInt(1, 1);
//			prepStmt.setInt(2, 4);
//			
//			ResultSet result = prepStmt.executeQuery();
//			while(result.next()) {
//				int officeCode = result.getInt("officeCode");
//				String name = result.getString("firstName");
//				System.out.println(officeCode + " | " + name);
//			}

//			String sql = "select * from orderdetails where orderNumber IN (?,?)";
//			prepStmt = con.prepareStatement(sql);
//			prepStmt.setInt(1, 10100);
//			prepStmt.setInt(2, 10102);
//
//			ResultSet result = prepStmt.executeQuery();
//			while (result.next()) {
//				int orderNumber = result.getInt("orderNumber");
//				String productCode = result.getString("productCode");
//				System.out.println(orderNumber + " | " + productCode);
//			}
			
//			String sql = "update employees set extension = ? where officeCode = ?";
//			prepStmt = con.prepareStatement(sql);
//			prepStmt.setInt(1, 5698);
//			prepStmt.setInt(2, 2);
//			
//			int rowAffected = prepStmt.executeUpdate();
//			System.out.println(rowAffected);
			

			String sql = "select * from employees where LENGTH(lastName) < ?";
			prepStmt = con.prepareStatement(sql);
			prepStmt.setInt(1, 5);

			ResultSet result = prepStmt.executeQuery();
			while (result.next()) {
				String lastName = result.getString("lastName");
				String firstName = result.getString("firstName");
				System.out.println(firstName + " | " + lastName);
			}
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
