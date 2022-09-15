package $String.com;

import java.util.Scanner;

public class Q4 {
	
	//Substring
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string>> ");
		String str1 = sc.nextLine();	
		
		System.out.print("Enter Substring beg>> ");
		int beg = sc.nextInt();
		
		System.out.print("Enter Substring end>> ");
		int end = sc.nextInt();

		System.out.println(str1.substring(beg,end));
		
	}
}