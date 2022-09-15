package com.vc;

public class NegativeIntBitShift {
	
		   public static void main(String[] args) {
		      int a = 4;          int b = -4;        int c = 0;
		      System.out.println("10  = " + Integer.toBinaryString(a));
		      System.out.println("-10 = " + Integer.toBinaryString(b));

		      //signed shift
		      c = a >> 2;              
		      System.out.println("10 >> 2  = " +c+ "-->"+ Integer.toBinaryString(c));

		      //unsigned shift
		      c = a >>> 2;            
		      System.out.println("10 >>> 2 = "+c+ "-->" + Integer.toBinaryString(c) );

		      c = b >> 2;              
		      System.out.println("-10 >> 2  = "+c+ "-->" + Integer.toBinaryString(c) );

		      c = b >>> 2;            
		      System.out.println("-10 >>> 2 = "+c+ "-->" + Integer.toBinaryString(c));
		   }

}
