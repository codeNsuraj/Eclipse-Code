package com.StringBuffernStringBuilder;

public class C1 {
	
	public static void main(String[] args) {
		
		StringBuffer str1 = new StringBuffer("1");
		
		StringBuilder str2 = new StringBuilder("1");
		
		String str3 = "1";
		
		System.out.println(str1.capacity());

		System.out.println(str2.capacity());
		
		str1.append(1);
		str2.append(1);
		str3.concat("1");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}