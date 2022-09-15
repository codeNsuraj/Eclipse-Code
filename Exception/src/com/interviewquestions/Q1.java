package com.interviewquestions;

import java.io.FileInputStream;
import java.io.FileReader;

public class Q1 {
	
	
	
	public static void main(String[] args) {
		

		
		FileInputStream fileInputStream;
		
		
		try {
			
			fileInputStream = new FileInputStream("C:\\Microsoft\\Class\\test.txt");
			System.out.println(fileInputStream);
			
			FileReader fileReader = new FileReader("");
			
			
			
			
		} catch (Exception e) {
			
			
			//System.out.println(fileInputStream);
			
			
		}
		
		
		String str = "\u2001s   a\u2001";//8193
		String str1 = "\u0020s   a\u0020";//32
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.trim());
		System.out.println(str1.trim());
		
		
		
		
		
		
		
	}

}
