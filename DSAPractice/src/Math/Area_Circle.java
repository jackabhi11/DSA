package Math;

import java.util.Scanner;

public class Area_Circle {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of the radius: ");
		int rad = scanner.nextInt();
		double res = 22/7 * rad * rad;
		System.out.println("Area of the circl is " + res + "sq meter");
		scanner.close();
	}
	
}
