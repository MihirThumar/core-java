package Corejava;

/* Practical 12 : Static Keywords
 * Write a program to demonstrate static methods, variables, and blocks.
 * @author MihirThumar
 */

public class Pratical12
{
	static 
	{
		System.out.println("static Block");
	}

	static void method1() 
	{
		System.out.println("Static Method");
	}

	static String a = "Static Variable";

	public static void main(String[] args)
	{
		method1();
		System.out.println(a);
	}
}