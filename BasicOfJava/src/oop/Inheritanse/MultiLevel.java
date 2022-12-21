package oop.Inheritanse;

/* Practical 13 : 
 * 2) Multilevel Inheritance
 */

public class MultiLevel extends Son {

	public MultiLevel()
	{
		System.out.println("Tapu Jethala Gadha");
	}
	public void favouriteFood()
	{
		System.out.println("Jalebi-Gathiya");
	}
	public static void main(String[] args)
	{
		MultiLevel level = new MultiLevel();
		level.fatherName();
		level.place();
		level.favouriteFood();
	}
}
class Father
{
	public Father()
	{
		System.out.println("Class Father");
	}
	public void fatherName()
	{
		System.out.println("ChampkChaha");
	}
}

class Son extends Father
{
	public Son()
	{
		System.out.println("Class Son");
	}
	public void place()
	{
		System.out.println("Mumbai");
	}
	public void favouriteFood()
	{
		System.out.println("Dhokda");
	}
}