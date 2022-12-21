package oop;

/* Practical 13 : Data Abstraction
 * Write a Program to Demonstrate Data Abstraction.
 */

public class Pratical13 {

	public static void main(String[] args)
	{
		Sharigaan sh = new Sharigaan();
		sh.mangekyo();
		sh.iternalMangekyo();
	}
}

abstract class MangekyoSharigaan
{
	abstract void mangekyo();
	
	void iternalMangekyo() {
		System.out.println("Non abstract Method");
	}
}

class Sharigaan extends MangekyoSharigaan
{
	@Override
	void mangekyo() {
		System.out.println("in abstract method");
	}
}