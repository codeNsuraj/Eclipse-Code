package com.interview;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	//Increase the salary of employees whose salary is less than 210000
	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "Suraj", 100000);
		Employee emp2 = new Employee(2, "Mamta", 200000);
		Employee emp3 = new Employee(3, "Reena", 300000);
		Employee emp4 = new Employee(4, "Shri", 400000);

		HashSet<Employee> h = new HashSet<Employee>();
		h.add(emp1);
		h.add(emp2);
		h.add(emp3);
		h.add(emp4);

		Set<Employee> collect = h.stream().map(x -> {
			if (x.getSalary() < 210000) {
				x.setSalary(x.getSalary() * 1.1);
				return x;
			}
			return x;
		}).collect(Collectors.toSet());

		System.out.println(collect);
	}
}