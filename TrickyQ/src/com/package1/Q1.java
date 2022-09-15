package com.package1;

public class Q1 {

	String s;

	Q1(String s) {
		this.s = s;
	}

	public static void main(String[] args) {

		Q1 p1 = new Q1("Reena");
		Q1 p2 = new Q1("Reena");

		boolean opearator = (p1 == p2) ? true : false;

		boolean EqualsMethod = (p1.equals(p2)) ? true : false;

		System.out.println(opearator + " " + EqualsMethod);

	}
}