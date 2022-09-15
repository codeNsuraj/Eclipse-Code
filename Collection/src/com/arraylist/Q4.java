package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Q4 {
	
	//Sort ArrayList in Descending order
	public static void main(String[] args) {	
		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("t");
		al.add("e");
		Collections.reverse(al);
		System.out.println(al);
	}
}