package com.knowprogram.com;

import java.util.Arrays;

public class Q16 {
	
	// Reverse array
	
	static int[] revArray(int[] ORG) {
		
		int size=ORG.length;
		
		int[] rev = new int[size];
		
		for(int i=0; i<size; i++) {
			
			rev[i] = ORG[size-i-1];	
		}
		return rev;
	}
	
	
	public static void main(String[] args) {

		int[] arr = new int[] {1,2,3,4,5,2,2,3,3,2222};
		
		int[] arr1 = revArray(arr);
		
		System.out.println(Arrays.toString(arr1));
		
	}	
}
