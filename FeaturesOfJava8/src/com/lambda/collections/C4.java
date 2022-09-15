package com.lambda.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class C4 {
	
	static List<User> MyFilter(List<User> l , Predicate<String> p1) {
		
		Iterator<User> itr = l.iterator();
		User str = null;
		List<User> adminList = new ArrayList<User>();
		
		while(itr.hasNext()) {
			str = itr.next();
			if(p1.test(str.getRole())) {
				adminList.add(str);
			}
		}
		return adminList;
	}
	
	public static void main(String[] args) {
		
		List<User> l = new ArrayList<User>();
		l.add(new User("Suraj","Admin"));
		l.add(new User("Raj","Member"));
		l.add(new User("Yash","Admin"));
		l.add(new User("Yatin","Member"));
		
		Predicate<String> p1 = (s) -> s.toLowerCase().equals("admin");
		
		List<User> newList =MyFilter(l, p1);
		
		System.out.println(newList);
	}
}