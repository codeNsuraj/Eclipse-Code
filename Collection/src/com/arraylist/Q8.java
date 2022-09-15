package com.arraylist;

import java.util.ArrayList;

public class Q8 {
	
//	Get the index of last occurrence of the element in the ArrayList	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(3);
		al.add(6);
		al.add(7);
		System.out.println(al);
		System.out.println(al.lastIndexOf(3));	
	}
}
