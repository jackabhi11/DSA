package Array;

import java.util.Arrays;

public class ReverseTheArray {
	
	public static void main(String args[]) {
		int arr[] = {2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr));
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void reverse(int arr[]) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int ref = arr[i];
			arr[i] = arr[j];
			arr[j] = ref;
			i++;
			j--;
		}
	}
}
