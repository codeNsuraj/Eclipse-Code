package com.package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDataBasic {

	public static void main(String[] args) {
		try {
			String sql = "insert into persons values(2,'Kurade','Suraj','Palshivane','Kolhapur');";
			// Step-1 : Load the Driver Class
			//Class.forName("com.mysql.jdbc.Driver");
			// Step-2 : Establish the connections
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
			// Step-3 : Create the statement
			Statement stmt = connection.createStatement();
			// Step-4 : Excecute query
			boolean isexecute = stmt.execute(sql);
			System.out.println(isexecute);
			// Step-5 : Close Connection
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}