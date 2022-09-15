package com.scanner;

import java.util.Scanner;

public class A {
	
	private int x;

	public A() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number>> ");
		x = sc.nextInt();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}
