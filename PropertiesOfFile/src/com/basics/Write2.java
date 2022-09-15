package com.basics;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write2 {
	
	public static void main(String[] args) throws IOException {
		
		Properties pop = new Properties();
		pop.setProperty("Datta", "1");
		pop.setProperty("Digu", "2");
		
		pop.store(new FileOutputStream("C:\\Users\\AAPLL1\\Desktop\\confidential1.properties"), "New System Config");
		
	}

}
