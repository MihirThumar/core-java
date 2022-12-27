package oop;

/* Practical 18 : Exception Handling
 * Write a program to handle exceptions using try, catch, finally, throw, and throws keywords
 */

public class Errorhandling {

	static void age(int age) throws ArithmeticException {
		if (age <= 17) {
			throw new ArithmeticException("You are not able to drive");
		} else {
			System.out.println("You are able to drive");
		}
	}

	public static void main(String[] args) {
		try {
			int a = 10 / 0;
		} catch (Exception e) {
			System.out.println("Error handled......");
			System.out.println("Error is... " + e.getMessage());
		} finally {
			System.out.println("Finally block run everytime");
		}
		age(17);
	}

}