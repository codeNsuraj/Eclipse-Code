package com.assignment;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {
		
	static String readData() throws IOException {	
		InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("C:\\Users\\AAPLL1\\Desktop\\IO\\Read.txt"));
		String str = "";
		char ch = '\u0000';
		
		while((ch=(char) inputStreamReader.read())!=(char)-1) {
			str = str + ch;	
		}
		inputStreamReader.close();
		return str;
	}
	
	static void writeData(String str) throws IOException {
		FileWriter fileWriter = new FileWriter("C:\\Users\\AAPLL1\\Desktop\\IO\\Read.txt");
		fileWriter.write(str);
		fileWriter.close();
	}
	

	public static void main(String[] args) throws IOException {
		String str =readData();	
		System.out.println(str);	
		
		writeData("Hello IO");

	}
}
