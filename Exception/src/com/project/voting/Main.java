package com.project.voting;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VM vm = new VM();
		System.out.println("Enter your Selection>> ");
		try {
			vm.coice(sc.nextInt());
		} catch (WrongSelectionException e) {
			System.err.println(e);
		}
		
		System.out.println("Program ended successfully");
		
		
	}

}
