package com.CharacterStream.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedWriter {
	
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\AAPLL1\\Desktop\\IO\\Read.txt"));
		
		String str = "Mamta";
		
		bufferedWriter.write(str);

		bufferedWriter.close();
		
	}

}
