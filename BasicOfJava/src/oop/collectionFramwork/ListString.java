package oop.collectionFramwork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Practical 22 : Write a program to prepare the list like(“A”, ”B”, ”C”, ”D”, ”A”, ”C”, ”E”, ”E”, ”E”) and remove duplicate values of the list.
 */

public class ListString {

	public static void main(String[] args) {
		String[] arr = { "A", "B", "C", "D", "A", "C", "E", "E", "E" };

		List<String> list = new ArrayList<>();
		for (String a : arr) {
			list.add(a);
		}

		Set<String> set = new HashSet<>();
		for (String s : list) {
			set.add(s);
		}

		for (String s : set) {
			System.out.println(s);
		}
	}

}