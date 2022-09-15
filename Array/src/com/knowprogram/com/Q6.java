package com.knowprogram.com;

public class Q6 {
	
	public static void main(String[] args) {
		
		int[] arr = {2,3,2,3};
		float sum=0;
		
		for(int i:arr) {
			sum+=i;
		}
		
		System.out.println(sum/arr.length);

	}	
}
