package com.package2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class C1 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Step 1 - Load the driver class 
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
		//Step 3 - Create the statement object
		Statement stmt = con.createStatement();
		//Step 4 - Execute query with query preparation
		for(int i=0; i<10 ; i++) {
			boolean execute = stmt.execute("insert into table2 (name) values('Reena-"+i+"')");
			System.out.println(execute);
		}
		//Step 5 - close connection
		con.close();
	}
}