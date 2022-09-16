package com.package3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class C2 {
	
	//Delete the record
	public static void main(String[] args) {
		
		try {
			//Step-1 Load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Step-2 Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
			//Step-3 Prepare the statements
			PreparedStatement stmt = con.prepareStatement("delete from table1 where id=?");
			stmt.setInt(1, 2);
			//Step-4 Execute the query
			int executeUpdate = stmt.executeUpdate();
			System.out.println(executeUpdate);
			//Step-5 close connections
			con.close();
			stmt.close();
		} catch (Exception e) {	
			e.printStackTrace();
		}
	}
}