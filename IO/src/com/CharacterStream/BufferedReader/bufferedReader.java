package com.CharacterStream.BufferedReader;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReader {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fileReader = new FileReader("C:\\Users\\AAPLL1\\Desktop\\IO\\Read.txt");
		
		BufferedReader bufferedInputStream = new BufferedReader(fileReader);
		
		
		char[] ch = new char[100];
		
		bufferedInputStream.read(ch);
		
		System.out.println(ch);
		
		
	}

}
