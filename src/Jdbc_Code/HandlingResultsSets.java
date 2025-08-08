package Jdbc_Code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class HandlingResultsSets {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String dbURL = "jdbc:mysql://127.0.0.1:3306/wipro_java_db";
		String username = "root";
		String password = "mysql@123SKSM";

		// Load JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Establish connection
		Connection con = DriverManager.getConnection(dbURL, username, password);

		// Create statement
		Statement st = con.createStatement();

		// Execute query
		String selectquery = "SELECT * FROM persons;";
		ResultSet rs = st.executeQuery(selectquery);

		// Get ResultSetMetaData to print column names dynamically
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();

		// Print column headers
		System.out.println("----------------------------------------------------");
		for (int i = 1; i <= columnCount; i++) {
			System.out.printf("%-15s", rsmd.getColumnName(i));
		}
		System.out.println();
		System.out.println("----------------------------------------------------");

		// Loop through ResultSet and print each row
		while (rs.next()) {

			// Example: Accessing using different methods (column name & index)
			int idByIndex = rs.getInt(1); // index
			String fnameByName = rs.getString("FirstName"); // by name
			String lnameByIndex = rs.getString(3); // index

			// Print all columns using for-loop (final requirement)
			for (int i = 1; i <= columnCount; i++) {
				System.out.printf("%-15s", rs.getString(i));
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		// Close resources
		rs.close();
		st.close();
		con.close();
	}
}

//
//package java_database;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
// 
//public class HandlingResultSet {
//	public static void main(String[] args) {
//		
//		
//		try {
//			//Connect to database - use psaDB (SQL)
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","mysql");
//		
//			
//			//Write & execute SQl query
//			Statement stmnt =  con.createStatement();
//			
//			//stmnt.executeUpdate("INSERT INTO registration (name, gmail, phone_no) VALUES ('aman', 'adam@gmail.com', '9632629555')");
//			
//			//execute the queries
//			String selectquery="select * from registration;";
//			
//			ResultSet rs=stmnt.executeQuery(selectquery);
//			
//			//while(rs.next()) {
//				//basic syntax for resultset
//				
//				//int id=rs.getInt("id");
//				//System.out.println(id);
//				
//				
//				//String fname=rs.getString("name");
//				//System.out.println(fname);
//				
//				
////we can use column indexing
//				//int id=rs.getInt(1);
//			//	System.out.println(id);
//				
//				//String fname=rs.getString(2);
//				//System.out.println(fname);
//				
//							
//				
//			//}
//			
//			while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String gmail = rs.getString("gmail");
//                String mobileno = rs.getString("phone_no");
// 
//                System.out.println("ID: " + id);
//                System.out.println("Name: " + name);
//                System.out.println("Gmail: " + gmail);
//                System.out.println("Mobile No: " + mobileno);
//                System.out.println("----------------------------");
//            }
//			//Close database connection
//			con.close();	
//			
//			}
//		catch (Exception e) {
//				e.printStackTrace();
//			}
//		
//	}
// 
//}
