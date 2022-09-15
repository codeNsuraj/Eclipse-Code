package com.OverridingEqualsHashCode;

import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		
		HashMap<Employee, String> m = new HashMap<Employee, String>();		
		m.put(new Employee(1, "Raj"), "Emp1");
		m.put(new Employee(1, "Raj"), "Emp1");
		System.out.println(m);		
	}
}