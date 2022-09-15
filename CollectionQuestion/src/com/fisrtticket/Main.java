package com.fisrtticket;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class Main {
	/**
	 * Todays Task: Ticket No : 5142
	 * 
	 *@Done Problem statement 1 : Create a class for language configuration which contains {id,language code,language ,country}
	 * 
	 *@Done Problem statement 2 : Now Create a set of language configuration
	 * 
	 *@Done Problem statement 3 : convert the language configuartion in to map having {KEY as language id and value as language code}
	 * 
	 *@Done problem statement 4 : create another map having {key as language code and value as langauge}
	 * 
	 * use Language (ISO 639)
	 * Take only 10 language
	 * 
	 */
	public static Map<?, ?> setToMap(Set<LanguageConfiguration> s, boolean b){
		if(b) {
			Map<Integer, String> m = new HashMap<Integer, String>();
			Iterator<LanguageConfiguration> iterator = s.iterator();
			LanguageConfiguration lc = null;
			while(iterator.hasNext()) {
				lc = iterator.next();
				m.put(lc.getId(), lc.getCode());
			}
			return m;
		}else {
			Map<String, String> m = new HashMap<String, String>();
			Iterator<LanguageConfiguration> iterator = s.iterator();
			LanguageConfiguration lc = null;
			while(iterator.hasNext()) {
				lc = iterator.next();
				m.put(lc.getCode(), lc.getLanguage());
			}
			return m;
		}
	}
	
	public static void main(String[] args) {
		Set<LanguageConfiguration> s1 = new HashSet<LanguageConfiguration>();
		s1.add(new  LanguageConfiguration(1, "ar-dz", "Arabic", "Algeria"));
		s1.add(new  LanguageConfiguration(2, "en-ca", "English", "Canada"));
		s1.add(new  LanguageConfiguration(3, "fr-ch", "French", "Switzerland"));
		s1.add(new  LanguageConfiguration(4, "hu", "Hungarian", "Hungary"));
		s1.add(new  LanguageConfiguration(5, "pt", "Portuguese", "Portugal"));
		s1.add(new  LanguageConfiguration(6, "ro-md", "Romanian", "Republic of Moldova"));
		s1.add(new  LanguageConfiguration(7, "es-cl", "Spanish", "Chile"));
		s1.add(new  LanguageConfiguration(8, "sv-fi", "Swedish", "Finland"));
		s1.add(new  LanguageConfiguration(9, "ko", "Korean", "Johab"));
		s1.add(new  LanguageConfiguration(10, "Gaelic", "Gaelic", "Gaelic"));
		Map<?, ?> m = setToMap(s1, true);
		System.out.println(m);
		Map<?, ?> m1 = setToMap(s1, false);
		System.out.println(m1);	
	}
}