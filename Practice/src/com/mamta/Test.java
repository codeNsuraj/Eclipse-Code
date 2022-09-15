package com.mamta;

public class Test {
	
	public static A getA(int id){
		
		return new A(id);
	}
	
	public static void main(String[] args) {

		A a = getA(11);
		
		System.out.println(a.id);
		
		System.out.println(a.getObject().id);
		
		
		
		double d = 10;
		
		int i =(int)Math.pow(2, 655);
		
		System.out.println(i);
		
		System.out.print("From "+ (int)Math.pow(2, 63));
		 
		 
		System.out.println(" To +" + (int)(Math.pow(2, 63)-1));
	}
}