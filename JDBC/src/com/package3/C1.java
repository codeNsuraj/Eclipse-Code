package com.package3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class C1 {
	//Update value
	public static void main(String[] args) {
		
		try {
			//Step-1 Load the Diver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Step-2 Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
			//Step-3 Prepare Statements
			PreparedStatement prepareStatement = con.prepareStatement("update table1 set name=? where id=?");
			prepareStatement.setString(1,"Raj");
			prepareStatement.setInt(2,1);
			//Step-4 
			int executeUpdate = prepareStatement.executeUpdate();
			System.out.println(executeUpdate);
			//Step-5
			con.close();
			prepareStatement.close();
		} catch (Exception e) {	
			e.printStackTrace();
		}
	}
}