package com.threadclass;

public class two extends Thread{
	
	@Override
	public void run() {
		String str = getName().substring(7);	
		int i = Integer.parseInt(str);
		i++;
		System.out.println("Multiplication table of "+i);
		for(int j=1; j<=10; j++) {
			System.out.println(j*i);
		}	
	}
	
	public static void main(String[] args) throws InterruptedException {	
		for(int i=0;i<=19;i++) {
			new two().start();
			Thread.sleep(1);
		}
	}
}