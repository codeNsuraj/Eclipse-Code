package com.arraylist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Q3 {
	
	//Loop ArrayList
	public static void main(String[] args) throws IOException {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add(null);
		arrayList.add(null);
		arrayList.add(null);
		arrayList.add("NAME");
		arrayList.add(null);
		arrayList.add(null);
		
		Iterator<String> iterator = arrayList.iterator();
		String str;
		
		while(iterator.hasNext()) {
			str = iterator.next();
			System.out.println(str);
			if (str != null && str.equals("NAME")) {
				iterator.remove();
			}
		}
	}	
}