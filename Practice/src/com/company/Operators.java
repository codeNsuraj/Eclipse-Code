package com.company;

public class Operators {
	
	public static void main(String[] args) {
		
		
		int x = 10;
		int y = -10;
		
		System.out.println(Integer.toBinaryString(x>>1)+" "+(x>>1));
		System.out.println(Integer.toBinaryString(x>>>1));
		System.out.println(Integer.toBinaryString(x<<1));
		System.out.println(Integer.toBinaryString(x<<1));
		
		System.out.println(Integer.toBinaryString(y>>>1)+" "+(y>>>1));
		System.out.println(Integer.toBinaryString(y>>1)+" "+(y>>1));
		System.out.println(Integer.toBinaryString(y<<1)+" "+(y<<1));
		System.out.println(Integer.toBinaryString(y<<1)+" "+(y<<1));
		
		
	}

}
