package com.CharacterStream.InputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class outputStreamWriter {
	
	public static void main(String[] args) throws IOException {
		
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("C:\\Users\\AAPLL1\\Desktop\\IO\\Read.txt"));
		
		String str = "हॅलो Reena";
		
		outputStreamWriter.write(str);
		
		outputStreamWriter.close();
				
	}

}
