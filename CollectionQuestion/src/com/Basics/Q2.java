package com.Basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q2 {
	/**
	 * Loop ArrayList
	 * @param l give list object as argument
	 * @param b if true then for each loop will work otherwise iterator will work
	 */
	static <E> void print(List<E> l, boolean b) {
		if(l != null) {
			if(b) {
				System.out.println("Printing using for each loop");
				for(E o : l) {
					System.out.println(o);
				}
			}
			else {
				Iterator<E> iterator = l.iterator();
				System.out.println("Printing using iterator");
				while(iterator.hasNext()) {
					System.out.println(iterator.next());
				}
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		print(arrayList, true);
	}
}