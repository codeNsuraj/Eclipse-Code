package com.serialization;

import java.io.Serializable;

public class Student implements Serializable {
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVrsionUID = 1L;
	String name;
	int ID;
	
	
	public Student(String name, int iD) {
		this.name = name;
		ID = iD;
	}	
}