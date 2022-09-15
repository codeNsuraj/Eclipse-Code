package com.recursion;

public class Test {
	
	
	static void print(int from, int to) {
		
		if(to==from) {
			
			System.out.println(from);
			
		}else {
			print(from,to-1);
			System.out.println(to);			
		}
		
	
		
	}

	
	
	public static void main(String[] args) {
		print(62, 100);
	}
}
