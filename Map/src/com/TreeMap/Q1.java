package com.TreeMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Q1 {
	
	public static void main(String[] args) {
		
		HashMap tm = new HashMap();
		tm.put(1,"dd");
		tm.put(3,"dd");
		tm.put(2,"dd");
		tm.put(3,"dd1");
		
		Set keySet = tm.keySet();
		Iterator it = keySet.iterator();
		
		System.out.println(keySet);
		System.out.println(tm);
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
			it.remove();
		}
		
		System.out.println(keySet);
		System.out.println(tm);
	}
}