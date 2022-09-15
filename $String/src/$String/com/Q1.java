package $String.com;

public class Q1 {
	
	public static void main(String[] args) {
			
		String arr1 = new String("abc");//heap
		
		String arr2 = "abc";//scp
		
		String arr3 = arr1.intern();//scp
		
		//String arr4 = arr1.concat("");//heap
		
		String arr4 = arr1.toUpperCase();//heap
		
		String arr5 = "ABC";//scp
		
		
		System.out.println(arr1==arr2);
		
		System.out.println(arr1.equals(arr2));
		
		System.out.println(arr3==arr4);
		
		System.out.println(arr3.equals(arr4));
			
		System.out.println(arr4==arr5);
		
		System.out.println(arr4.equals(arr5));
	}
}