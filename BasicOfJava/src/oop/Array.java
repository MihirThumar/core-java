package oop;

/* Practical 19 : Array
 * Write a program to find the index of an array element
 */

public class Array {

	public void arryMethod() {
		String[] arrayOfStudent = { "Ramesh", "Rahul", "Mitul", "Rohan", "Pream" };
		for (int i = 0; i < arrayOfStudent.length; i++) {
			System.out.println(i + " " + arrayOfStudent[i]);
		}
	}

	public static void main(String[] args) {
		Array array = new Array();
		array.arryMethod();
	}

}