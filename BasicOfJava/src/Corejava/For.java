package Corejava;

/* Practical 5 : For Loop
 * Write a program to demonstrate the example of the ‘for’ loop and print the below-mentioned pattern
 * @author MihirThumar
 */

public class For{

	public static void main(String[] args)
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}