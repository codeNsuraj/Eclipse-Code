package com.knowprogram.com;

import java.util.Arrays;

public class Q18 {
	
	//Linear Search
	
	static void linearSearch(int[] arr, int value) {
		boolean found=false;	
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==value) {
				System.out.println(value+" found in the array at index "+i+".");
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println(value+" not found.");
		}	
	}

	public static void main(String[] args) {
		linearSearch(new int[] {1,-2,3,4,44,3,5,7,8,4,3}, 44);
	}
}
