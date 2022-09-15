package com.basics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Write1 {
	
	public static void main(String[] args) throws IOException {
		
		Properties pop = new Properties();
		pop.setProperty("Datta", "1");
		pop.setProperty("Digu", "2");
		
		pop.store(new FileWriter("C:\\Users\\AAPLL1\\Desktop\\confidential.properties"), "New System Config");
		
	}
	
}
