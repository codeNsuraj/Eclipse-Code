package com.arraylist;

import java.util.ArrayList;

public class Q6 {
	//Remove element from the specified index in ArrayList
	public static void main(String[] args) {	
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(11);
		al1.add(22);
		al1.add(33);
		al1.add(44);
		al1.add(55);
		al1.add(66);
		al1.add(3);
		al1.remove(Integer.valueOf(3));
		System.out.println(al1);
	}
}