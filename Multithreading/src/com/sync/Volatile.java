package com.sync;

public class Volatile implements Runnable{
	
	  int a;

	public static void main(String[] args) {
		
		Volatile volatile1 = new Volatile();
		
		Thread thread = new Thread(volatile1);
		
		Thread thread1 = new Thread(volatile1);
		
		Thread thread2 = new Thread(volatile1);
		
		thread.start();
		thread1.start();
		thread2.start();		
		
	}

	@Override
	public void run() {
		
		System.out.println(++a);
		
	}

}
