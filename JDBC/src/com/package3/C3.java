package com.package3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C3 {
	
	//Select query
	public static void main(String[] args) {

		try {
			// Step-1 Load the Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Step-2 Establish the Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
			// Step-3 Preapare statements
			PreparedStatement stmt = con.prepareStatement("select * from table1");
			// Step-4 Execute Query
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.print('|');
				System.out.print(rs.getInt(1) + "|" + rs.getString(2));
				System.out.println('|');
			}
			// Step-5 Close connection
			con.close();
			rs.close();
			stmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}