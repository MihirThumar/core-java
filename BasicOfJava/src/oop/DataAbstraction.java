package oop;

/* Practical 13 : Data Abstraction
 * Write a Program to Demonstrate Data Abstraction.
 */

public class DataAbstraction {

	public static void main(String[] args) {
		B b = new B();
		b.show();
		b.display();
	}
}

abstract class X {
	abstract void show();

	void display() {
		System.out.println("Non abstract Method");
	}
}

class B extends X {
	@Override
	void show() {
		System.out.println("in abstract method");
	}
}