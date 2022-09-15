package com.lambda.collections;

import java.util.*;

public class C1 {
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9);
		l.forEach((i) -> System.out.println(i));
		l.forEach((i) -> {if(i%2==0) {System.out.println(i);}});	
		
	}
}