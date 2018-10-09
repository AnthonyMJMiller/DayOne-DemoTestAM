package excerciseUnitOne;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Scanner scan = new Scanner(System.in);
		
		// garbage line to clean out scanner (from numeric to scan.nextline(); )
		scan.nextLine();
		
		// primitive data types
		byte b = 127;
		short s = 128;
		int i = 133333;
		long l = 453455638906584l;
		float f = 56.7f; // can also use a cast "(float)"
		double d = 56.7;
		char c = '@';
		boolean bool = false;
		
		
		// this is a constant and can not change
		final String CHECK = "Hi";
		
		// implicit casting example
		int age = 26;
		double myAge = age;
		System.out.println(myAge);
		
		// explicit casting
		//when going from a more precise data type to less precise
		double priceTotal = 230.32;
		int newTotal = (int) priceTotal;
	}
	

}
