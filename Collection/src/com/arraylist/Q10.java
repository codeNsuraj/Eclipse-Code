package com.arraylist;

import java.util.ArrayList;
import java.util.HashMap;

public class Q10 {
	
//	Get element from ArrayList
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(2);
		al.add(6);
		al.add(7);
		System.out.println(al.toString());
		System.out.println(al.contains(1));
	}
}
