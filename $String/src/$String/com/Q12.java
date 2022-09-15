package $String.com;

public class Q12 {	
	
	/**
	 * reverse String by using array
	 * @param str  input String
	 * @return String object will be retuned
	 */
	static String reverseStringUsingArray(String str) {
		if(str.isEmpty())
			return "";
		int size = str.length();
		byte[] s1 = str.getBytes();
		byte[] s2 = new byte[size];
		for(int i = 0; i<size ; i++) {
			s2[i] = s1[size-i-1];	
		}	
		return new String(s2);
	}
	
	/**
	 * reverse String
	 * @param str  input String
	 * @return String object will be retuned
	 */
	static String reverseString(String str) {
		if(str.isEmpty())
			return "";
		int size = str.length();
		String s = "";
		for(int i = 0; i<size; i++) {
			s = s.concat(Character.toString(str.charAt(size-i-1)));
		}
		return s;	
	}
	
	public static void main(String[] args) {	
		String MyString = "Suraj";
		System.out.println(MyString);
		System.out.println(reverseStringUsingArray(MyString));
		System.out.println(reverseString(MyString));
	}
}