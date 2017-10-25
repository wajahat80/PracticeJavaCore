package com.core.datastructures;

import java.util.HashMap;
import java.util.Map;

public class DuplicationCheck {

	public static void main(String[] args) {
		int[] arr = { 2, 13, 4, 2, 66, 3, 1, 33, 24, 1 };
		print(arr);

		duplicateCheck(arr);

	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + ", ");
		System.out.println();
	}

	static void duplicateCheck(int[] arr) {
		Map<Integer, Integer> summary = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (!summary.containsKey(arr[i])) {
				int counter = 1;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						counter++;
					}
				}
				summary.put(arr[i], counter);
			}
		}

		summary.forEach((x,y)->System.out.print(x.intValue()+"="+y.intValue() +", "));
		
	}

}
