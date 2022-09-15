package com.company;

public class Test2 {
	
	static 
	{
		System.out.println("static block");
		
	}
	
	
	{
		
		System.out.println("intance initializer");

		
	}
	
	Test2(){System.out.println("Constructor");}
	
	
	public static void main(String[] args) {
		
		
		System.out.println("main method");
		
		Test2 t = new Test2();
		
		
	}
	
	
	
	
	

}
