package com.knowprogram.com;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size>> ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i = 0; i<arr.length; i++) {
			
			System.out.printf("Enter %d index number element>> ",i);
			arr[i]=sc.nextInt();
			
			
		}
		
		System.out.print("Your array = "+Arrays.toString(arr));
	
	}

}
