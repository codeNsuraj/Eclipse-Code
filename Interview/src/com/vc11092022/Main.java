package com.vc11092022;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.print("Enter String>> ");
		
		Scanner name = new Scanner(System.in);
	
		String str = name.next();
		
		char[] c = str.toCharArray();
		
		int num = 0;
		
		char i;
		
		for(int j = 0 ; j<str.length() ; j++) {
			
			i = str.charAt(j);
			
			if(!str.substring(0,j).contains(Character.toString(i))) {
				System.out.print(i);
					
				for(char cc : c) {		
					if(i==cc) {
						num++;
					}
				}			
				System.out.println("=" + num);
				num=0;	
			}
		}
	}
}