package Math;

import java.util.Scanner;

public class Area_Rectangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int width = scanner.nextInt();
		int length = scanner.nextInt();
		
		int area = width * length;
		
		System.out.println("Area of the " + area + " sqr meter");

	}

}
