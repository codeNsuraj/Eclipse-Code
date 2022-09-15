package $String.com;

import java.util.ArrayList;

public class Q10 {
	
	public static void main(String[] args) {
		
		String s1 = "pune";		
		
		String s2 = "pune";		
		
		String str1 = s1.concat(s2); 
		
		String str2 = s2.concat(s1); 
		
		System.out.println("1. "+ (s1==s2)); 
		
		System.out.println("2. "+str1.equals(str2));
		
		System.out.println("3. "+ (str1==str2)); 
		
		System.out.println("4. "+(str2.intern()==str1.intern())); 
		
		System.out.println("5. "+(str1.intern()==str2)); 
		
		System.out.println("6. "+(str1==str2.intern())); 
			
	}
}