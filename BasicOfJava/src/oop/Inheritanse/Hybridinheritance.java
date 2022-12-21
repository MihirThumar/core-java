package oop.Inheritanse;

/* Practical 13 :
 * 4) Hybrid Inheritance
 */

public class Hybridinheritance extends Liger implements Lion,Tiger {

	@Override
	public void show()
	{
		System.out.println("Lion And Tiger intergface Methods");
	}

	public void displayHybrid()
	{
		System.out.println("method in hybridInheritance");
	}

	public static void main(String[] args)
	{
		Hybridinheritance hybridinheritance = new Hybridinheritance();
		hybridinheritance.displayLiger();
		hybridinheritance.displayHybrid();
		hybridinheritance.show();
	}
}

class Liger{
	public void displayLiger()
	{
		System.out.println("inside Liger Class");
	}
}

interface Lion
{
	public void show();
}

interface Tiger
{
	public void show();
}