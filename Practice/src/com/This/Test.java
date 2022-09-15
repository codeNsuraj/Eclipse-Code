package com.This;

public class Test {
	
	int a;
	
	Test(int a){
		this.a=a;
		System.out.println(12);
	}
	
	
	Test(){}
	
	void m1(){
		this.getSquare(this.a);
		
	}
	
	void getSquare(int a) {
		
		System.out.println(a*a);
		
	}
	
	Object getObject() {
		return new Test();
	}
	
	
	public static void main(String[] args) {
		
		Test a = new Test(12);
		a.m1();
		System.out.println((Test)a.getObject());
		System.out.println(a.getObject());
	}
	

}
