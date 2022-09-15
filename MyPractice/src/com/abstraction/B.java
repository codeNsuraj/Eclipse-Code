package com.abstraction;

public class B extends A {
	
	B(){
		System.out.println("Constructor from class B");
	}

	@Override
	void m2() {	
		System.out.println("m2 from B");
	}

}
