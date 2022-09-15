package com.failsafefailfast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class C1 {
	
	
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("ss");
		al.add("ssa");
		al.add("ssa");
		al.add("ssa");
		System.out.println(al);
		
		Iterator iterator = al.iterator();
			
		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		System.out.println(al);
		
	}
}