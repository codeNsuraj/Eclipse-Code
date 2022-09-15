package com.package2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class C2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Step-1 : Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");		
		//Step-2 : Establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
		//Step-3 : Create the prepared Statement
		PreparedStatement stmt = con.prepareStatement("insert into table2 (name) values(?)");
		stmt.setString(1, "Suraj");
		//Step-4 : Execute Query
		int executeUpdate = stmt.executeUpdate();
		System.out.println(executeUpdate);
		//Step-5 : close connection
		con.close();
	}
}