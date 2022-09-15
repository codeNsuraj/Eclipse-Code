package com.unofficialjavagroup;

import java.util.Scanner;

public class NoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number>>");
		int i = sc.nextInt();
			
		if(i<=9) {System.out.println("Signle digit");}
		else if(i<=99 && i>9) {System.out.println("Two digit");}
		else if(i<=999 && i>99) {System.out.println("Three digit");}
		else if(i<=9999 && i>999) {System.out.println("Three digit");}
		else {System.out.println("Greater than Three digits");}
		
	}

}
