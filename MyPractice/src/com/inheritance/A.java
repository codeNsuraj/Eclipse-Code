package com.inheritance;

public class A {
	
	int i = 11;
	
	A(int i){	
		System.out.println("Constructor of Parent class "+ this.i);
		
		this.i=i;
	}
	
	void hello(){
		System.out.println("Hello Suraj");
	}
	
	
	 static void mm(){
		
	}
	 
	 
	 A(){
		 System.out.println("Hello from A");
	 }
}