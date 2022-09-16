package com.package2;

import java.util.StringJoiner;

public class C1 {
	
	public static void main(String[] args) {
		
		StringJoiner  sj = new StringJoiner(",","{","}");
		
		sj.add("Suraj");
		sj.add("Mamta");
		sj.add("Reena");
		sj.add("Shree");
		
		System.out.println(sj.toString());
		
		StringJoiner  sj2 = new StringJoiner(":");
		sj2.add("Speed");
		sj2.merge(sj);
		System.out.println(sj2);
	}
}