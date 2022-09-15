package com.pack1;

import java.util.Comparator;

public class ComparatorID implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getId() == o2.getId())
			return 0;
		else if(o1.getId() < o2.getId())
			return -1;
		return 1;
		
		//return o1.getId() - o2.getId();
	}
}
