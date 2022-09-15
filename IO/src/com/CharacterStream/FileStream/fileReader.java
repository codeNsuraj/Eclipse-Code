package com.CharacterStream.FileStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
	
	public static void main(String[] args) throws IOException {
		
		
		FileReader fileReader = new FileReader("C:\\Users\\AAPLL1\\Desktop\\IO\\Read.txt");
		
		char[] c = new char[100];
		
		fileReader.read(c);
		
		
		fileReader.close();
		
		System.out.println(c);
		
	}

}
