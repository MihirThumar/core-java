package Corejava;

//Operators

public class Pratical8 {

	static float calculator(float principle,float rate,float time) {
		
		float emi;
		
		rate = rate/(12*100);
		time = time * 12;
		emi = (float) ((principle * rate * Math.pow(1 + rate, time))
				/(Math.pow(1+rate, time)-1));
		
		return emi ;
	}
	
	public static void main(String[] args) {
		float principal, rate, time, emi;
        principal = 10000;
        rate = 10;
        time = 2;
         
        emi = calculator(principal, rate, time);
         
        System.out.println("monthly EMI is = " + emi);
	}
}
