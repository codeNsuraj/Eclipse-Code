package com.inheritance;

public class B// extends A
{
	
	int i=1111;
	
	@Override
	void hello(){
		System.out.println("Hello Suraj new");
	}

	public int getI() {
		System.out.println("this = "+this.i);
		System.out.println("super = "+super.i);	
		return i;
	}

	public void setI(int i) {
		this.i = i;
		super.i=i;
	}
	
	 B(){
		 System.out.println("Hello from B");
	 }
}