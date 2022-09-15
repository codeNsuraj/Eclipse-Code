package com.dynamicdispatch;

public class Test {
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child_1 c1 = new Child_1();
		Child_2 c2 = new Child_2();
		
		Parent ref;
		
		ref = p; // p-p
		ref.m1();
		ref.p();
		
		System.out.println();
		
		ref = c1;//c-p
		ref.m1();
		ref.p();
		
		System.out.println();
		
		ref = c2;//c-p
		ref.m1();
		ref.p();;
		
	}

}












