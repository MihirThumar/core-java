package Corejava;

/* Pratical 6:
 *  Write a program to demonstrate the example of a break/Continue statement (E.g. Use the loop for 10 numbers and 
 *  stop the execution after 7 numbers and skip any number)
 *  @author MihirThumar
 */

public class BreakAndContinue {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 8) {
				break;
			}
			if (i == 2) {
				continue;
			}
			System.out.println(i);
		}
	}
}