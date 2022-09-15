package com.company;

public class Test {

	public static void main(String[] args) {
		// \u000d //System.out.println("Hello java");
		
//1
		/*
		 * // //Parent Class Object // System.out.println(
		 * "***************************************************************"); // Parent
		 * p = new Parent(); // p.m1(); // p.m2(); // p.m3(); // System.out.println();
		 */		
		
//2		
		/*
		 * System.out.println(
		 * "***************************************************************"); //Child
		 * Class Child c = new Child(); c.m1(); c.m2(); c.m3(); c.m4();
		 * System.out.println();
		 */
		
//3		
		/*  System.out.println(
		  "***************************************************************");
		 // Dispatch Parent 1
		  Parent pc = new Child();
		  pc.m1();
		  pc.m2(); 
		  pc.m3();
		  System.out.println();
		 */ 

//4	  	 // Dispatch Parent 2
/*		Child c = new Child();
		Parent p =  new Parent();
		p=c;
		
		p.m1();
		p.m2();
		p.m3();*/

//5 
		// Child object creation
//		Parent p = new Child(); // Dynamic Dispatch
//		Child c = new Child(); // Child Object
//		
//		c = (Child) p;
//		c.m1();
//		c.m2();
//		c.m3();
//		c.m4();
		
		
		Parent p = new Parent(); // Dynamic Dispatch
		Child c = new Child(); // Child Object
		
		p = (Parent) c;
		//p = c;
		
		p.m1();
		p.m2();
		p.m3();
 
//6
		  //Child cp = new Parent();
		  
		  
		 
		

	}

}
