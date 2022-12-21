package oop;

/* Practical 14 : Encapsulation 
 * Write a program to demonstrate encapsulation
 */

public class Pratical14 {

	int length;
	int breadth;

	public Pratical14(int length, int breadth)
	{
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public void getArea()
	{
		int area = length * breadth;
		System.out.println("Area: " + area);
	}

	public static void main(String[] args)
	{
		Pratical14 pra = new Pratical14(10, 30);
		pra.getArea();
	}
}