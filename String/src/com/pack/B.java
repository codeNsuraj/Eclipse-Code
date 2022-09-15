package com.pack;

public class B {
	
	public static void main(String[] args) {
		
		
		String s1 = "abc";   //scp
		String s2 = new String("abc"); //heap
		String s3 = s2.intern(); //scp
		
		s3.compareTo(s3)
		
		char[] a = s1.toCharArray();
		
		for(char s : a) {}
		
		System.out.println(s1 == s2);// False
		System.out.println(s2 == s3);// False
		System.out.println(s1 == s3);// True
		System.out.println(s1.equals(s2));// True
		
	
	}
}