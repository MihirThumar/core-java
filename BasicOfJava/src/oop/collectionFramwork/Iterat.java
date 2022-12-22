package oop.collectionFramwork;

import java.util.*;

/* Practical 20 : Iterate List using iterator
 * Write a program to add string values(“Hello”,”world”,”$yourname” etc.) in the list and print all the values using an iterator
 */

public class Iterat {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add("Mihir");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}