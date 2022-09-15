package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Q7 {
//	Get Sub List of ArrayList
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("12");//0
		al.add("54");//1
		al.add("su");//2
		al.add("8i");//3
		al.add("d3");//4
		al.add("-87");//5
		al.add("d33");//6
		al.add("d122");//7
		List<String> subList = al.subList(2, 6);
		System.out.println(subList);
	}
}
