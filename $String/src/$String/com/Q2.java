package $String.com;

import java.util.Scanner;

public class Q2 {
	
	//Getting length of String
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first string>>");
		String str1 = sc.nextLine();
		
		System.out.print("Enter second string>>");
		String str2 = sc.next(); //************************
		
		System.out.println(str1+" length = "+str1.length());
		
		System.out.println(str2+" length = "+str2.length());
	}
}
