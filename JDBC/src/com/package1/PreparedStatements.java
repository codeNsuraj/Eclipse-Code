package com.package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatements {
	
	public static void main(String[] args) {
		
		try {
			//Step-1 : Load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Step-2 : Establish the Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
			//Step-3 : Prepare Statements
			PreparedStatement pstmt = con.prepareStatement("insert into persons values (?,?,?,?,?)");
			pstmt.setInt(1, 1);
			pstmt.setInt(2, 1);
			pstmt.setInt(3, 1);
			pstmt.setInt(4, 1);
			pstmt.setInt(5, 1);
			//Step-4 : Execute Query
			int executeUpdate = pstmt.executeUpdate();
			System.out.println(executeUpdate);
			//Step-5 : 
			con.close();
		} catch (Exception e) {
			e.printStackTrace();			
		}finally {
			
		}
	}
}