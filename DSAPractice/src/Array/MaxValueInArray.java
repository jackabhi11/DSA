package Array;

public class MaxValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {23,243,45,4,5,35434,24};
		
		int max = Integer.MIN_VALUE;
		
		for(int num: arr) {
			if(num > max) {
				max = num;
			}
		}
		
		System.out.println("Maximum value in the array is " + max);

	}

}
