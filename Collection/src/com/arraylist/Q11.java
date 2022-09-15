package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Q11 {
//	Copy All List elements to ArrayList
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(2);
		al.add(6);
		al.add(7);
		ArrayList<Integer> al1 = new ArrayList<Integer>(al.size());
		al1.add(11);
		al1.add(2);
		al1.add(3);
		al1.add(44);
		al1.add(2);
		al1.add(6);
		al1.add(7);
		al1.add(71);
		Collections.copy(al1, al);
		System.out.println(al);
		System.out.println(al1);
	}
}