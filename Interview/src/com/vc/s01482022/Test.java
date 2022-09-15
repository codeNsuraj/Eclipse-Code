package com.vc.s01482022;

public class Test {
	
	public static void main(String[] args)  {
		

		
		String str = "He saw a Peacock dancing in jungle";
		
		
		String[] words=str.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array 
		
		/*
		 * for(String w:words){ System.out.println(w); }
		 */
		
		
		for(int i=0 ; i<=str.length()-1; i++) {
			
			if(str.charAt(i)==' ') {
				System.out.println();
			}else{
				System.out.print(str.charAt(i));
			}
		}
		
		//for(char a:str) {
			
			
			
		//}
		
		
	}	
}