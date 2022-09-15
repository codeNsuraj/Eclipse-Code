package com.level1;

public class Fibonacci {

	public static void main(String[] args) {
		
		int num=10;
		int LHSnumber=0;
		int RHSnumber=1;
		
		// 0 1 1 2 3 5
		
		System.out.print(LHSnumber+" "); //0
		while((RHSnumber+LHSnumber)<=num) {
			System.out.print(RHSnumber+" ");//1
			
			
			RHSnumber+=LHSnumber;
			LHSnumber=RHSnumber-LHSnumber; // Swapping values without using third variable
		}
	}
}
