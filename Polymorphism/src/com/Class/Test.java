package com.Class;

public class Test {
	
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		A ref;
		
		ref=a;
		ref.display();
		
		ref=b;
		ref.display();
		
		ref=c;
		ref.display();
	}

}
