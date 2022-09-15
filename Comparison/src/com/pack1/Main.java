package com.pack1;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(12, "Yash", 123456));
		list.add(new Employee(11, "Raj", 34333));
		list.add(new Employee(132, "Ram", 75333));
		list.add(new Employee(45, "Ganesh", 55333));

		Collections.sort(list);
		System.out.println(list);

		Collections.sort(list, new ComparatorSalary());

		System.out.println(list);

		Constructor obj = new Constructor(null, null, null, 0, 0, null, null, null);
	}
}