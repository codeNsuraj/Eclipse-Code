package com.threadclass;

public class one extends Thread{
	
	@Override
	public void run() {
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
		
		System.out.println(getName());
		System.out.println(getId());
		
	}

	public static void main(String[] args) {
		
		one t1 = new one();
		one t2 = new one();
		one t3 = new one();
		
		t1.start();
		t2.start();
		t3.start();
		
//		t1.run();
	}

}
