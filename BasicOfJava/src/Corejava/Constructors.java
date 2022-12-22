package Corejava;

/* Practical 7 : Constructors
 * Write a program to demonstrate the example of constructor and Parameterized constructor (E.g. Pass two integer parameters and apply any mathematical formula)
 * @author MihirThumar
 */

public class Constructors {

	int a;

	public Constructors(int i, int j) {
		super();
		a = i * j;
		System.out.println(a);
	}

	public Constructors() {
		super();
		System.out.println("in the Constructer");
	}

	public static void main(String[] args) {
		Constructors practicle72 = new Constructors();
		Constructors practicle7 = new Constructors(10, 5);
	}
}