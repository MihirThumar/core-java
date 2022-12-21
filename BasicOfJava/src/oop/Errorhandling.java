package oop;

/* Practical 18 : Exception Handling
 * Write a program to handle exceptions using try, catch, finally, throw, and throws keywords
 */

public class Errorhandling {

	static void age(int age) throws ArithmeticException
	{
		if(age < 18)
		{
			throw new ArithmeticException("you are not able to drive");
		}
		else
		{
			System.out.println("you are able to drive");
		}
	}

	public static void main(String[] args)
	{
		String message = null;
		try
		{
			int a = 10/0;
		}
		catch (Exception e)
		{
			message = e.getMessage();
		}
		finally
		{
			System.out.println("Error handled......");
			System.out.println("Error is... "+message);
		}
		age(15);
	}
}