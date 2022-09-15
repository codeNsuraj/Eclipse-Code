package com.knowprogram.com;

public class Q14 {
	
	static int largestNumber(int[] arr) {
		
		int LargestNum=arr[0];
		int SecondLargestNum=arr[0];
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]>LargestNum) {
				SecondLargestNum=LargestNum;
				LargestNum=arr[i];
			}else if(arr[i]>SecondLargestNum){
				SecondLargestNum=arr[i];
			}
		}
		
		return SecondLargestNum;
	}
	

	public static void main(String[] args) {
		
		//Largest Number
		
		int[] arr1= {1,2,33,21,11};
		
		System.out.println(largestNumber(arr1));

	}

}
