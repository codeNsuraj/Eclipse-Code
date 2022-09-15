package com.Basics;

import java.util.ArrayList;

public class Q3 {
	/**
	 * Find length of ArrayList
	 */
	static int arrayListLength(ArrayList l) {
		int i = 0;
		for(Object o : l) {
			i++;
		}
		return i;
	}				
	public static void main(String[] args) {
		ArrayList<Object> arrayList = new ArrayList<Object>();
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");
		arrayList.add("5");
		int size = arrayListLength(arrayList);
		System.out.println(size);
	}
}