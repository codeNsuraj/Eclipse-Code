package com.interviewquestions;

public class Q2 extends Thread {
	
	
	@Override
	public void run(){
		
		//System.out.println(getName());
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		//Q2 ss = (ss) new Exception();
		
		Q2 q2 = new Q2();
		
		q2.start();
		
		q2.start();
	
	}
}