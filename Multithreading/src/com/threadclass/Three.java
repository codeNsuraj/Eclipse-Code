package com.threadclass;

public class Three implements Runnable{
	
	@Override
	public void run() {
		
		for(int i = 1; i<=10;i++) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
	
		Three three = new Three();
		
		Thread thread1 = new Thread(three);
		Thread thread2 = new Thread(three);
		Thread thread3 = new Thread(three);
		
		thread1.start();
		thread2.start();
		thread3.start();

	}
}