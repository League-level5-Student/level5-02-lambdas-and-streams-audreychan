package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	
	static Random rand = new Random();
	
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		System.out.println();
		//2. Call the printCustomMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			for(int i = s.length()-1; i >=0; i--) {
				System.out.print(s.charAt(i));
			}
		}, "hello");
		
		System.out.println();
		System.out.println();
		//3. Call the printCustomMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			for(int i = 0; i < s.length(); i++) {
				int j = rand.nextInt(1);
				switch(j) {
				case 0:
					System.out.print(s.toLowerCase().charAt(i));
					break;
				case 1:
					System.out.print(s.toUpperCase().charAt(i));
					break;
				}
			}
		}, "jello");
		
		//4. Call the printCustomMessage method using a lambda so that the String prints with a period in between each character.
		
		//5. Call the printCustomMessage method using a lambda so that the String prints without any vowels.
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
