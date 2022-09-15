package com.patterns;

import java.util.ArrayList;

public class Pattern1 {
	
	
	static void pattern1() {
		
		/*
		 
		 *****
		 *****
		 *****
		 *****
		 *****  
		
		*/
		
		for(int i=1; i<=5;i++) {
			
			for(int j=1; j<=5;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	static void pattern2() {
		/*	
			*****
			****
			***
			**
			*   */
		
		for(int i=1; i<=5;i++) {
			for(int j=0; j<=5-i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	
	static void pattern3() {
		
		/* 
		    *
			**
			***
			****
			*****
				  */
		
		for(int i=1; i<=5;i++) {
			for(int j=4; j>=5-i;j--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	
	static void pattern4() {
		
		/*		
		 		 *
		 		**
			   ***
			  ****
			 *****
				
					*/
		
		for(int i=1; i<=5;i++) {
			
			for(int j=1; j<=5-i;j++) {
				System.out.print(' ');
			}
			
			for(int j=4; j>=5-i;j--) {
				System.out.print('*');
			}
			
			System.out.println();
		}
	}
	
	
	static void pattern5() {
		
		/*		
		 		*****
		 		 ****
		 		  ***
		 		   **
		 		    *
					
		*/
		
		for(int i=1; i<=5;i++) {
			
			
			for(int j=3; j>=5-i;j--) {
				System.out.print(' ');
			}
			
			for(int j=0; j<=5-i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		
		pattern1();
		System.out.println();
		pattern2();
		System.out.println();
		pattern3();
		System.out.println();
		pattern4();
		System.out.println();
		pattern5();
		
		ArrayList<?> AL = new ArrayList<Object>();
		
	}
}
