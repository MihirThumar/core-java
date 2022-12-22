package oop.Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* Practical 24
 * Write a program to create a text file(The file name is “myTestFile”) and add your personal details to the test file
 */

public class ReadFile {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\admin\\Desktop\\myTestFile.txt");
//		Using Scanner
		try {
		Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println();

//		Uisng RandomAccessFile
		try {
			RandomAccessFile file2 = new RandomAccessFile("C:\\Users\\admin\\Desktop\\myTestFile.txt", "r");
			String str;
			while((str=file2.readLine())!=null) {
				System.out.println(str);
			}
			file2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();

//		Using BufferReader
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String st;
			while((st = br.readLine())!=null) {
				System.out.println(st);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();

//		Using FileReader
		try {
			FileReader fr = new FileReader(file);
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println();
		System.out.println();

//		Using String
		try {
			String data;
			data = new String(Files.readAllBytes(Paths.get("C:\\Users\\admin\\Desktop\\myTestFile.txt")));
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}