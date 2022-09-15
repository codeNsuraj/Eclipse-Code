package com.Test;

public class Test {
	
	void armstrong() {
		
		int sum=0;
		int remainder;
		int temp;
		
		
		for(int i=1; i<=1000; i++) {
			temp=i;
			
			while(temp>0) {
				
				remainder=temp%10;
				temp/=10;
				
				sum+=remainder*remainder*remainder;
								
			}
			
			if(sum==i) {System.out.println(i);}
			
			sum=0;
		}
				
	}
	
	
	void reverse(int num) {
		
		int temp=num;
		int remaider;
		int sum=0;
		
		
		while(temp>0) {
			
			remaider=temp%10;
			temp/=10;
			
			sum=(sum*10)+remaider;
			
		}
		
		System.out.println(sum);
		
	}
	
	
	void fibonacci(int stop) {
		
		//0 1 1 2 3 5
		
		int left=0;
		int right=1;
		
		System.out.print(left);
		while(stop>(left+right)) {
			System.out.print(right);
			right+=left;
			left=right-left;
		}
		
		
	}
	

}
