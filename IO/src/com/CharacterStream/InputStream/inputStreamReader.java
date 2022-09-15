package com.CharacterStream.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputStreamReader {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("C:\\Users\\AAPLL1\\Desktop\\IO\\Read.txt"));
		
		char c[] = new char[100];
		
		inputStreamReader.read(c);
		
		inputStreamReader.close();
	
		System.out.println(c);
				
	}
}
