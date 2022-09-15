package $String.com;

public class Q7 {
	
	//startsWith
	
	public static void main(String[] args) {
		
		System.out.println("abcd".startsWith("ac"));
		
		System.out.println("abcd".endsWith("d"));
		
		System.out.println("abcded ".indexOf(" "));
		
		System.out.println("abcdefg".indexOf("d",5));
		
		System.out.println("abcdefsdhsdf".lastIndexOf("s"));
		
		System.out.println("abcdfghjsdfhgh".lastIndexOf("s",11));
		
		System.out.println("ABCD".equalsIgnoreCase("abcd"));
	}
}