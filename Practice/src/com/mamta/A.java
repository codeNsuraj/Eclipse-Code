package com.mamta;

public class A {
	void m1(){
		System.out.println("m1 from A");
	}
	
	void m2(){
		System.out.println("m2 from A");
	}
	
	
	int id;
	
	
	A(int id){
		this.id=id;
	}
	
	A getObject() {		
		return this;
	}

	@Override
	public String toString() {
		return "A [id=" + id + "]";
	}
	
	
	
	
}
