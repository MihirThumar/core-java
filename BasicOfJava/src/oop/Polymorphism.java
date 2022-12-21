package oop;

/* Practical 16 : Polymorphism
 * 
 *  Write a program to demonstrate two types of polymorphism like compile-time and runtime Polymorphism
 */

public class Polymorphism implements A{
	
	@Override
	public void show()
	{
		System.out.println("Run-time Polymorphism");
	}

	public void sum(int a,int b)
	{
		int z = a + b;
		System.out.println(z);
	}
	
	public void sum(int a,double b)
	{
		double z = a + b;
		System.out.println(z);
	}

	public static void main(String[] args)
	{
		Polymorphism polymorphism = new Polymorphism();
		polymorphism.show();
		polymorphism.sum(10, 20);
		polymorphism.sum(15, 10.50);
	}
}

interface A
{
	public void show();
}