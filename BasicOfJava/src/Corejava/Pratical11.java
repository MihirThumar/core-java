package Corejava;

/* Practical 11 : String Methods
 * Create programs of all the string methods like charAt(), concat(), equals() etc
 * @author MihirThumar
 */
public class Pratical11 {

	public static void main(String[] args) 
	{
		String str = "Hello World";
		System.out.println(str);
		System.out.println(str.charAt(4)+" "+str.charAt(6));
		System.out.println(str.concat(" QDev"));
		System.out.println(str.replace("d", "a"));
		System.out.println(str.equals("Hello Worla"));
		System.out.println(str.equals("Hello World"));
	}
}