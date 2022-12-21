package Corejava;

/* Practical 08 : Operators
 * Apply EMI Calculator in Java - Java program to calculate EMI using Class, Object, Variables, Operators, and Datatypes
 * @author MihirThumar
 */

public class Pratical8 
{
	static float calculator(float principle,float rate,float time) 
	{
		float emi;
		rate /= (12*100);
		time *= 12;

		emi = (float) ((principle * rate * Math.pow(1 + rate, time))
				/(Math.pow(1+rate, time)-1));

		return emi ;
	}

	public static void main(String[] args) 
	{
		float principal, rate, time, emi;
        principal = 10000;
        rate = 10;
        time = 2;

        emi = calculator(principal, rate, time);

        System.out.println("Monthly EMI is = " + emi);
	}
}