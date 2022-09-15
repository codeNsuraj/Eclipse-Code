package com.knowprogram.com;

public class Q13 {
	
static int smallestNumber(int[] arr) {
		
		int SmallestNum=arr[0];
		
		for(int i=1; i<arr.length;i++) {
			
			if(arr[i]<SmallestNum) {
				SmallestNum=arr[i];
			}
		}
		
		return SmallestNum;
	}
	

	public static void main(String[] args) {
		
		//Largest Number
		
		int[] arr1= {1,2,33,21,11};
		
		System.out.println(smallestNumber(arr1));

	}

}
