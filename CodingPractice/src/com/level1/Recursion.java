package com.level1;

public class Recursion {
		
	static void print(int from, int to) {
		
		if(to==1) {
			
			System.out.println(1);
			
		}else {
			
			print(from, to-1);
			System.out.println(to);
			
		}
		
	}

	public static void main(String[] args) {
		
		print(1,100);
		
	}
}