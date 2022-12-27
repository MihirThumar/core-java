package Corejava;

/* Practical 12 : Static Keywords
 * Write a program to demonstrate static methods, variables, and blocks.
 * @author MihirThumar
 */

public class StaticKeywords {

	static {
		System.out.println("static block");
	}

	static void method1() {
		System.out.println("Static method");
	}
	static String a = "Static variable";

	public static void main(String[] args) {
		method1();
		System.out.println(a);
	}
	
}