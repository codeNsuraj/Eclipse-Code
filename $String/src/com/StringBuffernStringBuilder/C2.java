package com.StringBuffernStringBuilder;

public class C2 {
	
	//Find which .asp file is used for specified link
	public static void main(String[] args) {
		
		String link = "https://www.w3schools.com/sql/sql_foreignkey.asp";
		
		System.out.println(link.substring(link.lastIndexOf("/")+1,link.length()));
		
	}
}
