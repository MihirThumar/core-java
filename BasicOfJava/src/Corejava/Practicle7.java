package Corejava;

//Constructors

public class Practicle7 {

	int a;
	public Practicle7(int i,int j) {
		super();
		a = i*j;
		System.out.println(a);
	}
	
	public Practicle7() {
		super();
		System.out.println("in the Constructer");
	}

	public static void main(String[] args) {
		
		Practicle7 practicle72 = new Practicle7();
		Practicle7 practicle7 = new Practicle7(10, 5);		

	}
	
}
