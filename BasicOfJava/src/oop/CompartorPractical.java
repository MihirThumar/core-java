package oop;

import java.util.ArrayList;
import java.util.Collections;

/* Practical 23 : Comparator
 * Write a program to demonstrate comparator interface
 */
import java.util.Comparator;
import java.util.List;

public class CompartorPractical {

	public static void main(String[] args) {
		List<Employe> empl = new ArrayList<>();
		empl.add(new Employe(1, "Rahul", 30));
		empl.add(new Employe(4, "Om", 20));
		empl.add(new Employe(2, "Mitul", 35));
		empl.add(new Employe(3, "Pavan", 40));

		Employe employe = new Employe();

//		Print vlaue by id
		Collections.sort(empl, employe.idComparator);
		for (Employe e : empl) {
			System.out.println(e);
		}

//		Print vlaue by Name
		Collections.sort(empl, employe.nameComparator);
		for (Employe e : empl) {
			System.out.println(e);
		}

//		Print vlaue by Age
		Collections.sort(empl, employe.ageComparator);
		for (Employe e : empl) {
			System.out.println(e);
		}
	}
}

class Employe {

	private int id;
	private String name;
	private int age;

	public Employe() {
		super();
	}

	public Employe(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Comparator<Employe> idComparator = new Comparator<Employe>() {
		@Override
		public int compare(Employe e1, Employe e2) {
			return (e1.getId() - e2.getId());
		}
	};

	public Comparator<Employe> ageComparator = new Comparator<Employe>() {
		@Override
		public int compare(Employe e1, Employe e2) {
			return (e1.getAge() - e2.getAge());
		}
	};

	public Comparator<Employe> nameComparator = new Comparator<Employe>() {
		@Override
		public int compare(Employe e1, Employe e2) {
			return e1.getName().compareTo(e2.getName());
		}
	};

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" + age;
	}
}