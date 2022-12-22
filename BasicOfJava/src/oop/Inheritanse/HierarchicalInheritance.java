package oop.Inheritanse;

/* Practical 13 : 
 * 3) Hierarchical Inheritance
 */

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Fruit fruit = new Fruit();
		Bean bean = new Bean();
		Cereal cereal = new Cereal();

		fruit.brinjal();
		bean.brinjal();
		cereal.brinjal();
	}

}

class Vegetable {
	void brinjal() {
		System.out.println("King of Vegetables");
	}
}

class Fruit extends Vegetable {
	void mango() {
		System.out.println("King Of Fruits");
	}
}

class Bean extends Vegetable {
	void Chickpeas() {
		System.out.println("King of Beans");
	}
}

class Cereal extends Vegetable {
	void wheat() {
		System.out.println("King of Cereals");
	}
}