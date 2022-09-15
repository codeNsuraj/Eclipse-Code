package $String.com;

import java.util.Scanner;

public class Q3 {
	
	//Reverse String
	
	
	static String reverseStr(String str) {
		
		String copy="";
		int size = str.length();
		
		for(int i=size-1; i>=0; i--) {
			copy=copy+str.charAt(i);
		}

		return copy;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string>>");
		String str1 = sc.nextLine();
		
		System.out.println(reverseStr(str1));
		
	}

}
