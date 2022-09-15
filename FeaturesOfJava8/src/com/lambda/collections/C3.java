package com.lambda.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class C3 {
	
	static <E> void check(List<E> l, Predicate<E> p) {
		Iterator<E> itr = l.iterator();
		E str = null;
		while(itr.hasNext()) {
			str = itr.next();
			if(p.test(str)) {
				System.out.println(str);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		List<String> l = Arrays.asList("abc","def","dsa","asdw");
		
		Predicate<String> p1 = (s) -> s.contains("a");
		
		check(l, p1);
			
	}
}
