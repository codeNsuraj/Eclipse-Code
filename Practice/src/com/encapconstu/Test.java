package com.encapconstu;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Enter your name");
		
		String i = new Scanner(System.in).next();
		
		Super s = new Super(i);
		System.out.println(s.getName());
	}
}