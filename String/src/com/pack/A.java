package com.pack;

public class A {
	
	public static void main(String[] args) {
		
		String s1 = "abc1"; //scp


		String s2 = new String("abc1"); //heap

		String s3 = "abc1".intern(); //scp
		
		System.out.println(s1==s3);
		
		
		if(!s1.equals(s2)) {
			
			System.out.println("no equal");
			
		}else {
			
			System.out.println("Equal");
		}
		
	}

}
