package com.knowprogram.com;

import java.util.Arrays;

public class Q20 {
	
	//Remove Duplicates From Array
	
	static int[] removeDuplicates(int[] arr) {
		Arrays.sort(arr);
		int old=arr[0];
		int newArrSize=0;
		int[] newArr = {arr[0]};
		int[] temp = new int[newArrSize];	
		for(int i=1 ; i<arr.length; i++) {	
			if(old==arr[i]) {
				old=arr[i];
			}else {		
				newArrSize++;
				temp = newArr;
				newArr = new int[newArrSize];
				for(int j=0; j<newArrSize-1;j++) {
					newArr[j]=temp[j];
				}
				newArr[newArrSize-1]=arr[i-1];
				old=arr[i];
			}	
		}
		newArrSize++;
		temp = newArr;
		newArr = new int[newArrSize];
		for(int j=0; j<newArrSize-1;j++) {
			newArr[j]=temp[j];
		}
		newArr[newArrSize-1]=arr[arr.length-1];
		return newArr;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,2,3,4,44,44,44,44,5,5,5,5,5,5,6,7,8,9};
		
		System.out.println(arr1.length);

		System.out.println(Arrays.toString(removeDuplicates(arr1)));
		
		System.out.println(removeDuplicates(arr1).length);
	}
}