package Math;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int width = scanner.nextInt();
		
		int perimeter = 2*(length + width);
		
		System.out.println( "Perimeter of the rectangle: " + perimeter);
        scanner.close();
	}

}
