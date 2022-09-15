package com.pack1;

public class Employee implements Comparable<Employee>{
	private String name;
	private int salary, id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee(int id, String name, int salary) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	@Override
	public int compareTo(Employee o) {
		return this.salary - o.salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", id=" + id + "]";
	}
}