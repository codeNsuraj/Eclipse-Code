package com.vc.bank;

public class Test2 {

		
	public static void main(String...xx) {
		
		int x = 0;
		int num = 4000;
		double org=num;
		int i=0;
		while(num>0) {
			num/=10;
			i++;
		}
		
		System.out.println(i);
		
		double are = 0;
		
		for(int j=i;j>=1;j--) {
			
			are=Math.pow(10, j);
			
			System.out.println(org/are);
			
		}
		
	}
		
}
