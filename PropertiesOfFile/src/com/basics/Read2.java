package com.basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read2 {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream reader = new FileInputStream("C:\\Users\\AAPLL1\\Desktop\\confidential.properties");
		
		Properties properties = new Properties();
		
		properties.load(reader);
		
		System.out.println(properties.getProperty("datta"));
		
		System.out.println(properties.getProperty("password"));
	}

}
