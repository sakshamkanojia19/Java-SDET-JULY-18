//package Jdbc_Code;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class PreparedStatementEx {
//
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		// Execute parameterized queries using PreparedStatement
//
//		String dbURL = "jdbc:mysql://127.0.0.1:3306/wipro_java_db";
//		String username = "root";
//		String password = "mysql@123SKSM";
//
//		// Load JDBC driver
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		// Establish connection
//		Connection con = DriverManager.getConnection(dbURL, username, password);
//
//		// -------------------- Query 1 --------------------
//		// Search using FirstName and LastName
//		String query1 = "SELECT * FROM persons WHERE FirstName = ? AND LastName = ?";
//
//		PreparedStatement ps1 = con.prepareStatement(query1);
//		ps1.setString(1, "John");
//		ps1.setString(2, "Doe");
//
//		ResultSet rs1 = ps1.executeQuery();
//
//		System.out.println("---- Query 1: Search by FirstName and LastName ----");
//		while (rs1.next()) {
//			System.out.println("PersonID: " + rs1.getInt("PersonID"));
//			System.out.println("FirstName: " + rs1.getString("FirstName"));
//			System.out.println("LastName: " + rs1.getString("LastName"));
//			System.out.println("-------------------------");
//		}
//
//		rs1.close();
//		ps1.close();
//
//		// -------------------- Query 2 --------------------
//		// Search using FirstName and PersonID ** Hard coded
//		String query2 = "SELECT LastName, Address, City FROM persons WHERE FirstName = ? AND PersonID = ?";
//
//		PreparedStatement ps2 = con.prepareStatement(query2);
//		ps2.setString(1, "Liam");
//		ps2.setInt(2, 1052);
//
//		ResultSet rs2 = ps2.executeQuery();
//
//		System.out.println("---- Query 2: Search by FirstName and PersonID ----");
//		while (rs2.next()) {
//			System.out.println("LastName: " + rs2.getString("LastName"));
//			System.out.println("Address: " + rs2.getString("Address"));
//			System.out.println("City: " + rs2.getString("City"));
//			System.out.println("-------------------------");
//		}
//		
//		
//		//String Query 3 pass parameter and print everything
//		String query3 = "select * from persons where FirstName=? AND PersonID=?";
//		
//		PreparedStatement ps3 = con.prepareStatement(query3);
//		
//		ps3.setString(1, "John");
//		ps3.setInt(2, 1010);
//		
//		ResultSet rs3 = ps3.executeQuery();
//		
//		System.out.println("---- Query 3: Search by FirstName and PersonID all data ----");
//		while (rs3.next()) {
//			System.out.println("LastName: " + rs3.getString("FirstName"));
//			System.out.println("LastName: " + rs3.getString("LastName"));
//			System.out.println("Address: " + rs3.getString("Address"));
//			System.out.println("City: " + rs3.getString("City"));
//		}
//
//		
//		//Now Try for insert the data in
//		//using Insert : like new entry id = 1112, FirstName=Saksham , Lastname = Kanojia, Cityu:  new delhi, address :  dwarka more 
//		
//		
//		
//		// Close remaining resources
//		rs2.close();
//		rs3.close();
//		ps3.close();
//		ps2.close();
//		con.close();
//	}
//}



package Jdbc_Code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Execute parameterized queries using PreparedStatement

		String dbURL = "jdbc:mysql://127.0.0.1:3306/wipro_java_db";
		String username = "root";
		String password = "mysql@123SKSM";

		// Load JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Establish connection
		Connection con = DriverManager.getConnection(dbURL, username, password);

		// -------------------- Query 1 --------------------
		String query1 = "SELECT * FROM persons WHERE FirstName = ? AND LastName = ?";
		PreparedStatement ps1 = con.prepareStatement(query1);
		ps1.setString(1, "John");
		ps1.setString(2, "Doe");
		ResultSet rs1 = ps1.executeQuery();

		System.out.println("---- Query 1: Search by FirstName and LastName ----");
		while (rs1.next()) {
			System.out.println("PersonID: " + rs1.getInt("PersonID"));
			System.out.println("FirstName: " + rs1.getString("FirstName"));
			System.out.println("LastName: " + rs1.getString("LastName"));
			System.out.println("-------------------------");
		}
		rs1.close();
		ps1.close();

		// -------------------- Query 2 --------------------
		String query2 = "SELECT LastName, Address, City FROM persons WHERE FirstName = ? AND PersonID = ?";
		PreparedStatement ps2 = con.prepareStatement(query2);
		ps2.setString(1, "Liam");
		ps2.setInt(2, 1052);
		ResultSet rs2 = ps2.executeQuery();

		System.out.println("---- Query 2: Search by FirstName and PersonID ----");
		while (rs2.next()) {
			System.out.println("LastName: " + rs2.getString("LastName"));
			System.out.println("Address: " + rs2.getString("Address"));
			System.out.println("City: " + rs2.getString("City"));
			System.out.println("-------------------------");
		}
		rs2.close();
		ps2.close();

		// -------------------- Query 3 --------------------
		String query3 = "SELECT * FROM persons WHERE FirstName = ? AND PersonID = ?";
		PreparedStatement ps3 = con.prepareStatement(query3);
		ps3.setString(1, "John");
		ps3.setInt(2, 1010);
		ResultSet rs3 = ps3.executeQuery();

		System.out.println("---- Query 3: Search by FirstName and PersonID (All Data) ----");
		while (rs3.next()) {
			System.out.println("FirstName: " + rs3.getString("FirstName"));
			System.out.println("LastName: " + rs3.getString("LastName"));
			System.out.println("Address: " + rs3.getString("Address"));
			System.out.println("City: " + rs3.getString("City"));
			System.out.println("-------------------------");
		}
		rs3.close();
		ps3.close();

		// -------------------- INSERT Query --------------------
		String insertQuery = "INSERT INTO persons (PersonID, FirstName, LastName, Address, City) VALUES (?, ?, ?, ?, ?)";
		PreparedStatement insertPS = con.prepareStatement(insertQuery);

		insertPS.setInt(1, 1112);
		insertPS.setString(2, "Saksham");
		insertPS.setString(3, "Kanojia");
		insertPS.setString(4, "Dwarka More");
		insertPS.setString(5, "New Delhi");

		int rowsInserted = insertPS.executeUpdate();

		if (rowsInserted > 0) {
			System.out.println("✅ New person inserted successfully!");
		} else {
			System.out.println("❌ Insert failed.");
		}

		insertPS.close();

		// -------------------- Close Connection --------------------
		con.close();
	}
}

