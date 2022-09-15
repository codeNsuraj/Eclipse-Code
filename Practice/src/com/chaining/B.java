package com.chaining;

public class B extends A{
	
	B(){
		this("");
		System.out.println("sub class constructor (No-argument)");
	}
	
	B(String str){
		super();
		m1();
		System.out.println("sub class constructor (paramerized)");
	}
	
	void m1(){
		System.out.println("m1");
	}
}