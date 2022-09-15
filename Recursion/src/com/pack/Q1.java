package com.pack;

public class Q1 {	
	static void recursiveMethod(int start, int end){
		if(start == end)
			System.out.println(end);
		else
			recursiveMethod(start, end-1);
			System.out.println(end);	
	}
	public static void main(String[] args) {	
		recursiveMethod(1, 100);	
	}
}