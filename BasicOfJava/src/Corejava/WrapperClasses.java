package Corejava;

/* Practical 10 : Wrapperclasses
 * Write a practical to use this/super variable
 * @author MihirThumar
 */
public class Wrapperclasses {

	public int a = 1000;
	public int b;

	public static void main(String[] args) {
		Base base = new Base();
		base.method();
		new Wrapperclasses().Function();
	}

	public void Function() {
		this.a = 1500;
		System.out.println(a);

		this.b = 2000;
		System.out.println(b);
	}

}

class Base extends Wrapperclasses {

	void method() {
		System.out.println(super.a);
	}

}