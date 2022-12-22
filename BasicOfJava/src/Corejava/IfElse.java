package Corejava;

import java.util.Scanner;

/* Practical 2 : If / else condition
 * Write a program to demonstrate the use of if / else statements. (E.g Define an 'age' variable and check your age)
 * @author MihirThumar
 */

public class IfElse {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Your Age");

		int age = scanner.nextInt();

		if (age >= 18) {
			System.out.println("you are able to Drive");
		} else {
			System.out.println("sorry you are not able to Drive");
		}
		scanner.close();
	}
}