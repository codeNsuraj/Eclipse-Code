package com.lambda.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class C2 {
	
	public static void main(String[] args) {
		
		List<String> l = Arrays.asList("abc","def","dsa","asdw");
		
		Predicate<String> p1 = (s) -> s.contains("a");
		
		System.out.println(p1.test(l.get(0)));
		
	}
}