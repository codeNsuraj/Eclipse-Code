package Adya;

public class A {
	
	
	
	void baba() {
		System.out.println("Hello static in class");
	}

	public static void main(String[] args) {
		
		A a = new A();
		a.baba(); // direct cAlling
		
		B b = new B();
		b.ba(); // By using Object

	}

}
