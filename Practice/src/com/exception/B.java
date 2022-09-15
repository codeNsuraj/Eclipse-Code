package com.exception;

import java.util.Scanner;

public class B {
	
	//Dev - Suraj Kurade
	
	
	
	static boolean checkInt(String i) {
		
		try {
			int x = Integer.parseInt(i);
			return false;
		} catch (Exception e) {	
			return true;	
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x=0;	
		
		System.out.println("Enter your number>> ");
		String num = sc.next();
		boolean b = checkInt(num);

		while(b) {
			System.out.println("Please retry>> ");
			num = sc.next();
			b = checkInt(num);
		}
		
		int numFinal = Integer.parseInt(num);
		System.out.println("Your number = "+numFinal);	
	}
}
