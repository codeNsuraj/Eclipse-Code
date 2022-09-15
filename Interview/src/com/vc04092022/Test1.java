package com.vc04092022;

public class Test1 {
	
	//count punctuation from given string "my 5 name @ is suraj %"
	
	public static void main(String[] args) {
		String str= "my 5 name @ is suraj %";
		char[] Arr = str.toCharArray();
		int count = 0;
		for(char c : Arr) {
			if(!((c>='a' && c<='z')|| c==' ')) {
				count++;
			}	
		}
		System.out.println(count);
	}
}