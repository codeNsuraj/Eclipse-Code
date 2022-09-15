 package com.basics;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Read1 {
	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("C:\\Users\\AAPLL1\\Desktop\\confidential.properties");
		
		Properties properties = new Properties();
		
		properties.load(reader);
		
		System.out.println(properties.getProperty("datta"));
		
		System.out.println(properties.getProperty("password"));
	}
}