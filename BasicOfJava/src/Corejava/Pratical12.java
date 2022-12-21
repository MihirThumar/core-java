package Corejava;

//Static Keyword

public class Pratical12 {

	static int a = 100;
	static int b = 200;
	
	static {
		System.out.println("static Block");
	}
	
	static void method1() {
		System.out.println("calling by class name");
	}
	
	void method2() {
		System.out.println("calling by object");
	}
	
	public static void main(String[] args) {
		
		Pratical12.method1();
		System.out.println(Pratical12.a);
		
		Pratical12 pt = new Pratical12();
		pt.method2();
		
	}
	
}

