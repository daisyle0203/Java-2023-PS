package jdbc;

import java.sql.*;


public class DemoJDBC {
	public static void main(String[] args) throws SQLException {
//		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
//		String user = "root";
//		String password = "E%$88$5hM";
//		System.out.println("-------- MySQL JDBC Connection Demo ------------");
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver"); // optional
//			Connection connection = DriverManager.getConnection(dburl, user, password);
//			String SelectSQL = "Select * FROM employees";
//			Statement stmt = connection.createStatement();
//			ResultSet result = stmt.executeQuery(SelectSQL);
//			while (result.next()) {
//				String EmployeeID = result.getString("employeeNumber");
//				String fname = result.getString("firstName");
//				String lname = result.getString("lastName");
//				System.out.println(EmployeeID + " | " + fname + "|" + lname);
//			}
//			connection.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

		String url = "jdbc:mysql://localhost:3306/classicmodels";
		final String USER = "root";
		final String PASS = "E%$88$5hM";
		Connection con = DriverManager.getConnection(url, USER, PASS);
//		String sqlQuery = "INSERT INTO EMPLOYEES (officeCode,firstName,lastName,email,extension,reportsTo,VacationHours,employeeNumber,jobTitle) VALUES (?,?,?,?,?,?,?,?,?)";
//		PreparedStatement prepStmt = con.prepareStatement(sqlQuery);
//		prepStmt.setInt(1, 6);
//		prepStmt.setString(2, "Jamil");
//		prepStmt.setString(3, "fink");
//		prepStmt.setString(4, "JJ@gmail.com");
//		prepStmt.setString(5, "2759");
//		prepStmt.setInt(6, 1143);
//		prepStmt.setInt(7, 9);
//		prepStmt.setInt(8, 0003);
//		prepStmt.setString(9, "Manager");
//		int affectedRows = prepStmt.executeUpdate();
//		System.out.println(affectedRows + " row(s) affected !!");
		
//		String SelectSQL = "update employees set firstName=? , lastName=? where employeeNumber=?";
//		PreparedStatement mystmt = con.prepareStatement(SelectSQL);
//		mystmt.setString(1, "Gary");
//		mystmt.setString(2, "Larson");
//		mystmt.setLong  (3, 1002);
//		mystmt.executeUpdate();

	}

}
