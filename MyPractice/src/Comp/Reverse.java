package Comp;

public class Reverse {
	
	
	static void reverse(int num) {
		
		int sum = 0;
		int remaider = 0;
		int temp=num;
		int length=0;
		
//		while(temp>0) {	
//			remaider=(temp%10);//getting right hand side digit from number
//			temp/=10;//to divide the number with 10 so we'll remove one digit which is in remaider
//			length++;
//		}
//		
//		System.out.println(length);

		while(temp>0) {	
			remaider=(temp%10);//getting right hand side digit from number
			temp/=10;//to divide the number with 10 so we'll remove one digit which is in remaider
			System.out.print(temp +"<--Temp ");
			System.out.print(remaider +"<--Rem ");
			sum=(int) (sum*10+remaider);
			System.out.println(sum+"<--sum ");
		}
		
		System.out.println(sum);
		
		

//		
//		for(int j=1; j<=3; j++) {
//			
//			remaider=(temp%10);//getting right hand side digit from number
//			
//			temp/=10;//to divide the number with 10 so we'll remove one digit which is in remaider
//			
//			sum+=remaider*remaider*remaider;//to get the sum of cubes of each digit
//			}
			
		}
	
	
	public static void main(String[] args) {
		
		reverse(1234567890);
		
		
		
	}

}
