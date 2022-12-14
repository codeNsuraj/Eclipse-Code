package com.vc.bank;

import java.util.Scanner;

public class Test {
	static int progno;
	static String name;
	static String dob;
	static String gender;
	static long mobno;
	static String address;
	static String acctype;
	static String email;
	static String pwd;
	static int ammount;
	static long accno;
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//1.Name
		System.out.println("\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\tPLEASE ENTER YOUR NAME\t\t\t\t");
		System.out.println("\t=====================================================================================================================================");
		while(true) {
			System.out.print("\t\t\t\t\t\t\t\t");
			name = sc.next();
			if(name.length()==0) {
				System.out.println("\t\t\t\t\t\t\tInvalid Name...! Please Retry");
			}else{
				break;
			}
		}
		
		//2.DOB
		System.out.println("\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\tPLEASE ENTER YOUR DATE OF BIRTH\t\t\t\t");
		System.out.println("\t=====================================================================================================================================");
		while(true) {
			System.out.print("\t\t\t\t\t\t\t\t");
			dob = sc.next();
			if(dob.length()==0 && dob.length()<=10) {
				System.out.println("\t\t\t\t\t\t\tInvalid Date...! Please Retry");
			}else{
				break;
			}
		}
		
		//3.Gender
		System.out.println("\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\tPLEASE SPECIFY YOUR GENDER(M/F)\t\t\t\t");
		System.out.println("\t=====================================================================================================================================");
		while(true) {
			System.out.print("\t\t\t\t\t\t\t\t");
			gender = sc.next();
			if(!gender.equals("M") && !gender.equals("F")) {
				System.out.println("\t\t\t\t\t\t\tInvalid Selction...! Please Retry");
			}else{
				break;
			}
		}
		
		//4.Mob Number
		System.out.println("\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\tPLEASE ENTER YOUR MOBILE NUMBER\t\t\t\t");
		System.out.println("\t=====================================================================================================================================");
		while(true) {
			System.out.print("\t\t\t\t\t\t\t\t");
			mobno = sc.nextLong();
			if(mobno<1000000000l || mobno>9999999999l) {
				System.out.println("\t\t\t\t\t\t\tInvalid Mobile Number...! Please Retry");
			}else{
				break;
			}
		}
		
		//5.Address
		System.out.println("\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\tPLEASE ENTER YOUR ADDRESS\t\t\t\t");
		System.out.println("\t=====================================================================================================================================");
		while(true) {
			System.out.print("\t\t\t\t\t\t\t\t");
			address = sc.next();
			if(address.length()==0 || address.length()<=10) {
				System.out.println("\t\t\t\t\t\t\tInvalid Address...! Please Retry");
			}else{
				break;
			}
		}
		
	
		//6.Account type

		System.out.println("\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\tPLEASE SELECT ACCOUNT TYPE\t\t\t\t\n");
		System.out.println("\t\t\t\t\t1.)Current account \t\t\t2.)Savings account\n \n\t\t\t\t\t3.)Salary account \t\t\t4.)Fixed account\n\n\t\t\t\t\t5.)Recurring account");
		System.out.println("\t=====================================================================================================================================");
		while(true) {
			System.out.print("\t\t\t\t\t\t\t\t");
			acctype = sc.next();
			if((int)acctype.length()<1 || (int)acctype.length()>5) {
				System.out.println("\t\t\t\t\t\t\tInvalid Selection...! Please Retry");
			}else{
				break;
			}
		}
		
		
		
		//7.email
		System.out.println("\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\tPLEASE ENTER YOUR EMAIL\t\t\t\t");
		System.out.println("\t=====================================================================================================================================");
		while(true) {
			System.out.print("\t\t\t\t\t\t\t\t");
			email = sc.next();
			if(!email.contains("@") || !email.endsWith(".com")) {
				System.out.println("\t\t\t\t\t\t\tInvalid Email...! Please Retry");
			}else{
				break;
			}
		}	
		
			
		
		//8.Password 
		System.out.println("\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\tCREATE NEW PASSWORD\t\t\t\t");
		System.out.println("\t=====================================================================================================================================");
		while(true) {
			System.out.print("\t\t\t\t\t\t\t\t");
			pwd = sc.next();
			if(!pwd.contains("@") || pwd.length()<=6) {
				System.out.println("\t\t\t\t\tYour Password does not meet the required length/complexity...! ");
				System.out.println("\t\t\t\t\t\t\tPlease Retry");
			}else{
				break;
			}
		}
		
		
		System.out.println();	
		
		System.out.print("\t\t\t\t\t\t\tVERIFIING ALL DETAILS");		
		for(int i=1; i<=10;i++) {
			System.out.print(".");
			Thread.sleep(200);
		}System.out.println();
		
		System.out.print("\t\t\t\t\t\t\tCREATING NEW ACCOUNT");		
		for(int i=1; i<=11;i++) {
			System.out.print(".");
			Thread.sleep(200);
		}System.out.println();
		
		//9.generating account number
		accno=4000l+progno;
		progno++;
		
		System.out.println("\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\t!..ACCOUNT SUCCESSFULLY CREATED..!\t\t\t\t");
		System.out.println("\t=====================================================================================================================================");
		
		
		System.out.println("\t=====================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\t!..YOUR ACCOUNT NO IS : "+ accno +"..!\t\t\t\t");
		System.out.println("\t=====================================================================================================================================");
		
//		
//		System.out.println("*"+name+"*");
//		System.out.println("*"+dob+"*");
//		System.out.println("*"+gender+"*");
//		System.out.println("*"+mobno+"*");
//		System.out.println("*"+address+"*");
//		System.out.println("*"+acctype+"*");
//		System.out.println("*"+email+"*");
//		System.out.println("*"+pwd+"*");
//		System.out.println("*"+accno+"*");
//		
		
//		System.out.println("Enter Account type \n\n 1.)Current account \n 2.)Savings account \n 3.)Salary account \n 4.)Fixed account\n 5.)Recurring account\n");
//		System.out.println("=====================================================================================================================================");
//		System.out.println("=====================================================================================================================================");
//		System.out.println("\s\s\s\s=====================================================================================================================================");	
		

	}

}
