package Loops;

import java.util.Scanner;

public class Q6 {
	
	public static void main(String[] args) {
		//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
		//For example, if the input is 12345, the output should be 54321.
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i=str.length()-1; i>=0; i--) {
			
			System.out.print(str.charAt(i));
			
		}
		
		
		
	}
	
}
