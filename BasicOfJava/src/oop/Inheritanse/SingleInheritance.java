package oop.Inheritanse;

/* Practical 13 : 
 * 1) Single Inheritance
 */

public class SingleInheritance extends OldFather {

	private String sonName = "Tapu";

	public static void main(String[] args)
	{
		SingleInheritance single = new SingleInheritance();
		single.lastName();
		System.out.println(single.firstName+" "+single.sonName);
	}
}

class OldFather
{
	String firstName = "ChampakChaha";

	public void lastName()
	{
		System.out.println("Gadha");
	}
}