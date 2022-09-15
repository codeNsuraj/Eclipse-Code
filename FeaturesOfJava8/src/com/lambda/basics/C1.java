package com.lambda.basics;

public class C1 {
	
	public static void main(String[] args) {
		//no argument
		I1 i1 = () -> System.out.println("Hi Lambda");
		i1.print();
		
		//with argument
		I2 i2 = (a , b) -> System.out.println(a + b); 
		i2.add(1, 2);
		
		//with argument and return
		I3 i3 = (str) -> {return str.toUpperCase();};
		System.out.println(i3.toCaps("hello upper"));
	}
}