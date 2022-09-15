package com.Q9;

public class Derived extends Base {
	public static void Task() {
		System.out.println("Derived");
	}

	public static void main(String[] args) {
		Base obj = new Derived();
		obj.Task();
	}
}