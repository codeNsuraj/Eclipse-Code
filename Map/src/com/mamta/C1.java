package com.mamta;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class C1 {

	public static void main(String[] args) {

		HashMap<Employee, String> m = new HashMap<Employee, String>();
		m.put(new Employee(1, "Suraj", 100000), "Suraj");
		m.put(new Employee(2, "Mamta", 100000), "Mamta");//
		m.put(new Employee(2, "Mamta", 100000), "Mamta");//
		m.put(new Employee(4, "Shri", 100000), "Shri");

		Set<Employee> keySet = m.keySet();
		Iterator<Employee> it = keySet.iterator();

		while (it.hasNext()) {
			Employee type = it.next();
			System.out.println(type);

		}

	}
}