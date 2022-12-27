package oop;

/* Practical 17 : Interface
 * Write a program to demonstrate the interface
 */

public class InterFaceImpl implements Service {

	@Override
	public void sum(int a, int b) {
//		Logic will apply here
		int x = a + b;
		System.out.println(x);
	}

	@Override
	public void multiply(int a, int b) {
//		Logic will apply here
		int y = a * b;
		System.out.println(y);
	}

	public static void main(String[] args) {
		InterFaceImpl impl = new InterFaceImpl();
		impl.sum(10, 20);
		impl.multiply(10, 20);
	}

}

interface Service {

	public void sum(int a, int b);

	public void multiply(int a, int b);

}