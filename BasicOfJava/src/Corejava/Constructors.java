package Corejava;

/* Practical 7 : Constructors
 * Write a program to demonstrate the example of constructor and Parameterized constructor (E.g. Pass two integer parameters and apply any mathematical formula)
 * @author MihirThumar
 */

public class Constructors {

	public Constructors(int i, int j) {
		super();
		int a = i * j;
		System.out.println(a);
	}

	public Constructors() {
		super();
		System.out.println("In the constructer");
	}

	public static void main(String[] args) {
		Constructors con = new Constructors();
		Constructors cons = new Constructors(10, 5);
	}

}