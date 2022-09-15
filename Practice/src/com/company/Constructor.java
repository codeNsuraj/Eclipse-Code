package com.company;

public class Constructor {
	int i ;
	
	public int Constructor(int i) {
		
		return this.i;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor constructor =new Constructor();
		System.out.println(constructor.i);
		constructor.Constructor(0);

	}

}
