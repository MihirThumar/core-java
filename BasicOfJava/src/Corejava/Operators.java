package Corejava;

/* Practical 08 : Operators
 * Apply EMI Calculator in Java - Java program to calculate EMI using Class, Object, Variables, Operators, and Datatypes
 * @author MihirThumar
 */

public class Operators {

	static float calculator(float principle, float rate, float time) {
		rate /= (12 * 100);
		time *= 12;
		float emi = (float) ((principle * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1));
		return emi;
	}

	public static void main(String[] args) {
		float principal = 10000;
		float rate = 10;
		float time = 2;
		float emi = calculator(principal, rate, time);
		System.out.println("Monthly EMI is = " + emi);
	}

}