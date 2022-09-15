package com.selfassignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Q1 {
	
	public static void main(String[] args) {
		
		String Rahul = "Rahul";
		String Ganesh = "Ganesh";
		String Praveen = "Praveen";
		String Vaibhav = "Vaibhav";
		Vaibhav.hashCode()
		
		Set<String> Dep1 = new HashSet<String>();
		Dep1.add(Rahul);
		Set<String> Dep2 = new HashSet<String>();
		Dep2.add(Ganesh);
		Dep2.add(Praveen);
		Set<String> Dep3 = new HashSet<String>();
		Dep3.add(Ganesh);
		Dep3.add(Vaibhav);
		Set<String> Dep4 = new HashSet<String>();
		Dep4.add(Praveen);
		Dep4.add(Vaibhav);
		
		HashMap<String, Set<String>> Deparments1 = new HashMap<String, Set<String>>();
		Deparments1.put("Dep-1",Dep1);
		Deparments1.put("Dep-2",Dep2);
		Deparments1.put("Dep-3",Dep3);
		Deparments1.put("Dep-4",Dep4);
		
		HashMap<String, HashMap<String, Set<String>>> University = new HashMap<String, HashMap<String, Set<String>>>();
		University.put("College-1",Deparments1);
		
		System.out.println(University.hashCode());
	}
}