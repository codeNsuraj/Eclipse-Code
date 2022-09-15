package Loops;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		int x = new Scanner(System.in).nextInt();
		int factorial = 1;
		for(int i = 1; i<=x; i++) {
			factorial*=i;
			
		}
		
		System.out.println(factorial);
		
		


	}

}
