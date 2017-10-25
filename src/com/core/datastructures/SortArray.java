package com.core.datastructures;

public class SortArray {

	/* The logic of sorting is to iterate the array from index 0 to end and start second loop with the index+1
	 * index 0 i.e. 2 will compare start with index 2 i.e. 13,4....1 and found 1 at index 6 so swap it with index 6
	 * in second iteration it start inner loop from index 2
	 */
	public static void main(String[] args) {
		int[] arr = { 2, 13, 4, 2, 66, 3, 1, 33, 24, 1 };
		
		// java.util.Arrays.sort(arr);
		
		print(arr);

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			print(arr);
		}

	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + ", ");
		System.out.println();
		
	}
	
	
}
