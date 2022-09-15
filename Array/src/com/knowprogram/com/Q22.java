package com.knowprogram.com;

import java.util.Arrays;

public class Q22 {
	
	/**
	 * Add Element to Array in Java
	 */
	static int[] insert(int[] arr,int pos, int key) {
		int sizearr1 = arr.length+1;
		int[] arr1 = new int[sizearr1];
		if(pos>=sizearr1) {return null;}
		int i=0;//arr pointer location
		int j=0;//arr1 pointer location
		
		while(j<sizearr1) {
			if(j==pos) {
				arr1[j]=key;
			}else {
				arr1[j]=arr[i];
				i++;
			}
			j++;
		}
		return arr1;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int[] newArr = insert(arr, 7, 33+'d');
		System.out.println(Arrays.toString(newArr));	
	}
}
