package com.ByteStream;

import java.io.FileInputStream;
import java.io.IOException;

public class fileInputStream {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\AAPLL1\\Desktop\\IO\\Read.txt");
		
		int i=0;
		
		/*
		 * System.out.println(i);
		 * 
		 * System.out.println((char)i);
		 */
		
		while((i=fileInputStream.read())!=-1) {
			
			System.out.print((char)i);
			
		}
		
		fileInputStream.close();
	}
}