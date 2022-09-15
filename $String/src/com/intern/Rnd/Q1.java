package com.intern.Rnd;

public class Q1 {
	
	public static void main(String[] args) {
		
		String s1 = "pune";		
		
		String s2 = "pune";		
		
		String str1 = s1.concat(s2); 
		
		String str2 = s2.concat(s1); 
		
		String intr2 = str2.intern(); //2
		
		String intr1 = str1.intern(); //1
		
		System.out.println("1. " + (s1 == s2)); 
		
		System.out.println("2. " + (str1.equals(str2)));
		
		System.out.println("3. " + (str1==str2)); 
		
		System.out.println("4. " + (intr1 == intr2));
		
		System.out.println("5. " + (intr1 == str2));
		
		System.out.println("6. " + (str1 == intr2)); 
		
	}
}