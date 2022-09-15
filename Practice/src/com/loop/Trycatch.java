package com.loop;

import java.util.Scanner;

public class Trycatch {
	
	
	static boolean intCheck(String value) {
		int i;
		try {
			i = Integer.parseInt(value);
		}catch(Exception e) {
			return true;
		}		
		return false;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number>> ");
		while(intCheck(sc.next())) {
			System.out.print("Retry>> ");
		}	
	}
}