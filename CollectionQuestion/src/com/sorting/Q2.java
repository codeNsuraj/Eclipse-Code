package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Q2 {
	
	/**
	 * Sort ArrayList
	 */
	static ArrayList<String> sortArrayList(List<String> l) {
		Iterator<String> iterator = l.iterator();
		ArrayList<String> l1 = new ArrayList<String>();
		while(iterator.hasNext()) {
			l1.add(iterator.next());
		}
		Collections.reverse(l1);
		return l1;
	}
	
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("1");
		l.add("4");
		l.add("3");
		l.add("4");
		l.add("5");
		ArrayList<String> sortedArrayList = sortArrayList(l);
		System.out.println("OG = "+l);
		System.out.println("Sorted = "+sortedArrayList);
	}	
}
