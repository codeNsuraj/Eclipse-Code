package com.sync;

public class One extends Thread {
	
	//Synchronization using sync method
	
	@Override
	public void run() {
		table();
	}
	
	synchronized void table() {
		for(int i = 1; i<=10;i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
	
		One three = new One();
		
		Thread thread1 = new Thread(three);
		Thread thread2 = new Thread(three);
		Thread thread3 = new Thread(three);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}	
}
