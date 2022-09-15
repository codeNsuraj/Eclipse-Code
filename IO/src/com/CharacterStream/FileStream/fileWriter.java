package com.CharacterStream.FileStream;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
	
	public static void main(String[] args) throws IOException {
		
		
		FileWriter fileWriter = new FileWriter("C:\\Users\\AAPLL1\\Desktop\\IO\\Read.txt");
		
		String str = "Krishna Krishna Hare Hare!!!";
		
		fileWriter.write(str);
		
		fileWriter.close();
		
	}

}
