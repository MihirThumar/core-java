package oop;

/* Practical 23 : comparable
 * Write a program to demonstrate comparable interface
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparablePratical {

	public static void main(String[] args)
	{

		List<Employee> empl = new ArrayList<>();
		empl.add(new Employee(1, "Rahul", 30));
		empl.add(new Employee(4, "Om", 20));
		empl.add(new Employee(2, "Ramesh", 35));
		empl.add(new Employee(3, "Rohan", 40));

		Collections.sort(empl);

		for(Employee e:empl)
		{
			System.out.println(e);
		}

	}

}

class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private int age;

	@Override
	public String toString()
	{
		return "[id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public Employee(int id, String name, int age)
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Employee emp)
	{
		return (this.id - emp.id);
	}
}