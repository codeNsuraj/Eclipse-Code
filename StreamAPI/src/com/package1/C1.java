package com.package1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C1 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,3,4,8);
		List<Integer> collect = list.stream().map(x->x*x).collect(Collectors.toList());
		
		System.out.println(list);
		System.out.println(collect);
		
	}
}