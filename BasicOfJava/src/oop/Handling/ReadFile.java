package oop.Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Practical 24
 * Write a program to create a text file(The file name is “myTestFile”) and add your personal details to the test file
 */

public class ReadFile {

	public static void main(String[] args) {

		try {
		File file = new File("C:\\Users\\admin\\Desktop\\myTestFile.txt");
		Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}