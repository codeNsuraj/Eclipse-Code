package com.exception;

import java.util.Scanner;

public class A {
	
	//Dev - Suraj Kurade
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			int x = sc.nextInt();

			try {
	
				System.out.println(100/x);
	
			}catch(ArithmeticException e) {
				
				System.out.println(e);
				
			}
			
		}catch(Exception e) {
			
			System.out.println(e);
			
		}
		
		System.out.println("End");

	}	
}
