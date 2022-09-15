package Loops;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		int x = new Scanner(System.in).nextInt();
		int z=x;
		int y = new Scanner(System.in).nextInt();
		
		for(int i=1; i<y; i++) {
			x = x*z;
		}
		
		System.out.println(x);
			
		
	}

}
