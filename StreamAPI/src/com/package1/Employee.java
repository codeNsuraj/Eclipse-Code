package com.package1;

public class Employee {
	private String id;
	private String name;
	private int salaey;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalaey() {
		return salaey;
	}
	public void setSalaey(int salaey) {
		this.salaey = salaey;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salaey=" + salaey + "]";
	}	
}
