package com.arraylist;

import java.util.ArrayList;

public class Q5 {
	//Insert all the collection elements to the specified position in ArrayList
	public static void main(String[] args) {	
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("1");
		al1.add("2");
		al1.add("3");
		al1.add("4");
		al1.add("5");
		al1.add("6");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("7");
		al2.add("8");
		al2.add("9");
		al1.addAll(4,al2);
		System.out.println(al1);
	}
}