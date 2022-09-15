package com.knowprogram.com;

import java.util.Scanner;

//GCD (HCF) number

public class Q17 {
	
	static int getGCD(int a, int b) {
		
		while(a!=b) {
			
			if(a>b) {
				a=a-b;
				
			}else {
				b=b-a;
			}	
		}
		return a;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size>>");
		int size=sc.nextInt();
		int[] arr= new int[size];
		for(int i=0; i<size; i++) {
			System.out.print("Enter "+(i+1)+" number of "+ size +" >>");
			arr[i]=sc.nextInt();
		}
		
		int result = arr[0];
		
		for(int i=1; i<size ; i++) {
			result = getGCD(result, arr[i]);
		}
		
		System.out.println("GCD(HCF) = "+result);
	}
}






















