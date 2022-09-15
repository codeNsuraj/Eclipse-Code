package com.RnD;

import java.util.Arrays;
import java.util.Scanner;

public class GrowableArray {
	
	
	static int[] getArray(int size) {

		return new int[size];
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Size of Array>> ");
		int[] arr1 =  getArray(sc.nextInt());
		int oldsize = arr1.length;
		
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=3;
		arr1[3]=4;
		arr1[4]=5;
		
		while(true) {
			System.out.println("Do you want to increase the size of array(y/n)? ");
			if(sc.next().charAt(0)=='y') {
				System.out.println("Enter size>> ");
				int[] arr2 = new int[sc.nextInt()];
				for(int i=0; i<arr1.length ;i++) {
					arr2[i]=arr1[i];
				}
				arr1 = getArray(arr2.length);
				for(int i=0; i<arr1.length ;i++) {
					arr1[i]=arr2[i];
				}
				
			}else {
				break;
			}	
		}
		
		System.out.println("Size of array old="+oldsize+" new="+arr1.length);
		
		System.out.println(Arrays.toString(arr1));
		
		
		
	}
	

}
