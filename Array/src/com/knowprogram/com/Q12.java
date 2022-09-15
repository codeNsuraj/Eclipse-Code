package com.knowprogram.com;

import java.util.Arrays;

public class Q12 {
	
	static int largestNumber(int[] arr) {
		
		int LargestNum=arr[0];
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]>LargestNum) {
				LargestNum=arr[i];
			}
		}
		
		return LargestNum;
	}
	

	public static void main(String[] args) {
		
		//Largest Number
		
		int[] arr1= {1,2,33,21,11};
		
		System.out.println(largestNumber(arr1));

	}
}
