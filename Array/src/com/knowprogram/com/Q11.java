package com.knowprogram.com;

import java.util.*;

public class Q11 {

	public static void main(String[] args) {
		
		//Merge two sorted Arrays
		
		int[] arr1= {1,2,33,21,11};
		
		int[] arr2= {55,66,997};
		
		int[] arr3= new int[arr1.length+arr2.length];
		
		System.arraycopy(arr1, 0,arr3 , 0, arr1.length);
		System.arraycopy(arr2, 0,arr3 , arr1.length, arr2.length);
		
		Arrays.sort(arr3);
		
		System.out.println(Arrays.toString(arr3));
		
	}
}
