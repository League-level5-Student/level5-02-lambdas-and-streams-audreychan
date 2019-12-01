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
				int j = rand.nextInt(2);
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
		
		System.out.println();
		System.out.println();
		
		//4. Call the printCustomMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			for(int i = 0; i < s.length(); i++) {
				if(i == s.length()-1) System.out.print(s.charAt(i));
				else {
					System.out.print(s.charAt(i));
					System.out.print(".");
				}
			}
			
		}, "banjo");
		
		
		System.out.println();
		System.out.println();
		
		//5. Call the printCustomMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			for(int i = 0; i < s.length(); i++) {
				switch(s.toLowerCase().charAt(i)) {
				case 'a':
					break;
				case 'e':
					break;
				case 'i':
					break;
				case 'o':
					break;
				case 'u':
					break;
				default:
					System.out.print(s.charAt(i));
				}
			}
			
		}, "willow");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
