package Array;

import java.util.Arrays;

public class SwapOfElements {
	
	public static void main(String args[]) {
		int arr[] = {2,6,3,7,1,5};
		System.out.println(Arrays.toString(arr));
		
		int ind1 = 2;
		int ind2 = 5;
		
		Swap(arr, ind1, ind2);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void Swap(int arr[], int ind1, int ind2) {
		int ref = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = ref;
	}

}
