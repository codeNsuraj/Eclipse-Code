package com.abstraction;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		Bank bank = new SBI();
		System.out.println(bank.rateOfInterest());
		
		Bank bank2 = new PNB();
		System.out.println(bank2.rateOfInterest());
		
		
		
	}

}
