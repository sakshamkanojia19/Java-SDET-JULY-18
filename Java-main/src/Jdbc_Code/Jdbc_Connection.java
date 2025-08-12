package Jdbc_Code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Connection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String dbURL = "jdbc:mysql://127.0.0.1:3306/wipro_java_db";
		String username = "root";
		String password = "mysql@123SKSM";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(dbURL,username,password);
		
		
		
		Statement st = con.createStatement();
		
		String selectquery = "select * from persons;";
		
		ResultSet rs = st.executeQuery(selectquery); 
		
		while (rs.next()) {
			System.out.println(rs.getString("PersonID"));
		    System.out.println(rs.getString("FirstName"));
		    System.out.println("LastName");
		
		    int id1 = rs.getInt(1);
		    System.out.println(id1);
		    
		    
		    //indexing
		    String s = rs.getString(2);
		    System.out.println(s);
		    
		    //print everything whole data
		    
		    
		    
		    
		    
		}
		
	}

}
