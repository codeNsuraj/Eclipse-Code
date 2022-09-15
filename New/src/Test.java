import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String...x) {
		
		Scanner sc = new Scanner(System.in);
		boolean bool = false;
		
		ArrayList<String> al = new ArrayList<String>();
		String str =null;
		
		
		while(true) {
			
			System.out.println("Do you want to complete the action(exit)? ");
			
			str = sc.next();
			
			
			if("exit".equals(str)) {
				
				break;
				
			}
			
			System.out.println("Enter>>");
			
			al.add(str);

		}
		
		System.out.println(al);
	}
}
