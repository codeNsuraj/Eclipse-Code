package com.serilization.mamta;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;

public class Main implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 999L;

	
	public Main(String var) {
		this.var = var;
	}


	String var;
	
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		  FileOutputStream fileOutputStream = new
		  FileOutputStream("C:\\Users\\AAPLL1\\Desktop\\IO\\Hello1.txt");
		  
		  ObjectOutputStream objectOutputStream = new
		  ObjectOutputStream(fileOutputStream);
		  
		  Main main1 = new Main("Suraj"); Main main2 = new Main("Kurade");
		  
		  
		  objectOutputStream.writeObject(main1); objectOutputStream.writeObject(main2);
		  
		  objectOutputStream.flush(); objectOutputStream.close();
		  fileOutputStream.close();
		 
		
			/*
			 * FileInputStream fileInputStream = new
			 * FileInputStream("C:\\Users\\AAPLL1\\Desktop\\IO\\Read.txt");
			 * ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			 * 
			 * Main m1 = (Main) objectInputStream.readObject(); Main m2 = (Main)
			 * objectInputStream.readObject();
			 * 
			 * System.out.println(m1.var); System.out.println(m2.var);
			 */
		
	}
	
}
