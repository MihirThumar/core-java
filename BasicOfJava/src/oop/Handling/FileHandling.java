package oop.Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* Practical 24
 * Write a program to create a text file(The file name is “myTestFile”) and add your personal details to the test file
 */

public class FileHandling {

	public static void main(String[] args) {

		try {
		File file = new File("C:\\Users\\admin\\Desktop\\myTestFile.txt");
			if(file.createNewFile()) {
				System.out.println("File Created " + file.getName());
			}else {
				System.out.println("File Alredy Exits");
			}

			FileWriter writer = new FileWriter("C:\\Users\\admin\\Desktop\\myTestFile.txt");
			writer.write("My Name is Mihir\nI am 21 year Old\nI currently prsuing my graduation in Dr.Shubhas");
			writer.close();
		} catch (IOException e) {
			System.out.println("Error..... " + e.getMessage());
		}
	}
}