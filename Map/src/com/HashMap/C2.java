package com.HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class C2 {
	
	public static void main(String[] args) {
		
		
		HashMap hm = new HashMap();
		
		System.out.println(hm.put(1,2));
		System.out.println(hm.put(8,3));
		System.out.println(hm.remove(1));
		System.out.println(hm);
		
		
		HashSet hs = new HashSet();
		hs.add(hs);
	}
}
