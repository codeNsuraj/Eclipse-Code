
package $String.com;

public class Q8 {
	
	public static void main(String[] args) {
		String str1 = new String("abc");//heap
		
		String str2 = "abc";//scp
		
		String str3 = str1.concat("c");//heap
		
		String str4 = str2.concat("");//scp
		
		String str5 = str1.intern();//scp
		
		String str6 = str2.intern();//scp
		
		String str7 = new String("abcc");//heap
		
		String str8 = str7.intern();//scp
		
		System.out.println(str3==str7);
		
		System.out.println(str3.hashCode());
		
		System.out.println(str7.hashCode());
		
		System.out.println(new String("abcc").hashCode());
	}

}
