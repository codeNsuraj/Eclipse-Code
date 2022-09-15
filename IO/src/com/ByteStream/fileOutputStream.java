package com.ByteStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\AAPLL1\\Desktop\\IO\\Read.txt");
		
		byte[] arr = {'R', 'E', 'E', 'N', 'A'};
		
		byte[] arr1 = "Reena Mamta Suraj".getBytes();
		
		fileOutputStream.write(arr1);
		
		fileOutputStream.close();
		
		
	}
	

}
