package Pattern;

import java.util.Scanner;

public class Hollow_Square {
    
	public static void main(String args[]) {
		System.out.println("Enter the number: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i==1 || i==n || j==1 || j==n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}
		scanner.close();
	}
}
