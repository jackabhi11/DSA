package Math;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String args[]) {
		System.out.println("Enter the number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int fact = 1;
		for(int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println("Factorial of " + num + " is " + fact);
		scanner.close();
	}

}
