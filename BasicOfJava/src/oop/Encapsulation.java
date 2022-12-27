package oop;

/* Practical 14 : Encapsulation 
 * Write a program to demonstrate encapsulation
 */

public class Encapsulation {

	int length;
	int breadth;

	public Encapsulation(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public void getArea() {
		int area = length * breadth;
		System.out.println("Area: " + area);
	}

	public static void main(String[] args) {
		Encapsulation pra = new Encapsulation(10, 30);
		pra.getArea();
	}

}