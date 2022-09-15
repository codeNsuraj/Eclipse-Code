package com.knowprogram.com;


public class Q19 {
	
	//Binary Search
	
	static int binarySearch(int[] arr, int beg, int end, int key) {
		
		if(end>=beg) {
			int mid = (beg+end)/2;

			if(arr[mid]==key) {
				return mid;
			}else if(arr[mid]<key) {
				return binarySearch(arr, mid+1, end, key);
			}else {
				return binarySearch(arr, beg, mid-1, key);
			}
		}
		return -1;	
		
	}
	
	public static void main(String[] args) {
			
		int[] arr = {1,2,3,4,5,6,7,8};
	
		System.out.println(binarySearch(arr, 0, arr.length-1,7));
	}	
}
