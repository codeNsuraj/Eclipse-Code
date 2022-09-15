package Test;




class Parent{
	
	void m1() {
		System.out.println("Parent m1");
	}
	
	void m2() {
		System.out.println("Parent m2"); //ans
	}
}

class Child extends Parent{
	
	void m1() {
		System.out.println("Child m1");	//ans	
	}
	
	void m3() {
		System.out.println("Child m3");
	}
	
}

class Test{
	
	public static void main(String args[]) {
		
		Parent p = new Child();
		
		p.m1();
		p.m2();
		
	}
	
}
