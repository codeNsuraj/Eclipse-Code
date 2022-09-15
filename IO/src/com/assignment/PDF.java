package com.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.text.PlainDocument;

public class PDF {
	
	
	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream fileInputStream = new FileOutputStream("C:\\Users\\AAPLL1\\Desktop\\IO\\Read.pdf");
		
		fileInputStream.write('H');
		
		fileInputStream.close();
		
		
		
		PlainDocument n = new PdfDocument();
		
		
		
		
	}

}
