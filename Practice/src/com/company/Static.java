package com.company;

public class Static {
	
			//1
			static int i;
			
			
			//2
			static {
				System.out.println("First static block");
				m1();
				System.out.println();	
			}
			
			
			
			
			//3
			public static void main(String[] args) {
				
				System.out.println("Main Method");
				m1();
				System.out.println();			
			}
			
			
			//4
			public static void m1() {
				System.out.println(j);
			}
			
			
			//5
			static {
				System.out.println("Second static block");
				m1();
				System.out.println();
			}
			
			
			//6
			static int j=20;


}
