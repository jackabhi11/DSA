package Pattern;

import java.util.Scanner;


public class Zig_Zag {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int row = scan.nextInt();
		
		System.out.println("Enter the number of count of star in a line:  ");
		int count = scan.nextInt();
		
		for(int i = 1; i <= row; i++) {
		  //forward digonal line
			for(int j = 1; j <= count; j++) {
				for(int k = 1; k <= count; k++) {
					if(j == k) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		
		//backward digonal line
			for(int j = 1; j <= count; j++) {
				for(int k = 1; k <= count; k++) {
					if(j-1 == count-k) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}			
		}

	}

}
