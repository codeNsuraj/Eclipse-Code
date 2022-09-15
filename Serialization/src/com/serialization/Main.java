package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
	
	
	public static void main(String[] args) throws IOException {

		Student s1 = new Student("Suraj", 1);
		Student s2 = new Student("Mamta", 11);
		
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\AAPLL1\\Desktop\\IO\\Read.txt");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(s1);
		objectOutputStream.writeObject(s2);
		
		objectOutputStream.flush();
		objectOutputStream.close();
		fileOutputStream.close();
		
		System.out.println("Serialization completed Successfully...");	
		
		
		
		
	}
}
