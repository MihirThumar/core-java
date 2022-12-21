package Corejava;

/* Practical 10 : Wrapper classes
 * Create a practical to compare two variables of Wrapper class using Wrapper classes.
 * @author MihirThumar
 */
public class Pratical10 {

	public int a=1000;
	public int b;
	
	public static void main(String[] args)
	{
		Base base = new Base();
		base.method();
		new Pratical10().Function();
	}

	public void Function() 
	{
		this.a = 1500;
		System.out.println(a);

		this.b = 2000;
		System.out.println(b);
	}
}
class Base extends Pratical10
{
	void method() {
		System.out.println(super.a);
	}
}