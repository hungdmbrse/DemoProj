package org.vietjack.excersice.javabasic.array;

import java.util.Arrays;

public class sortArray {
	public static void main(String[] args) {
		int array[] = { 2, 5, 3, -2, 4, 6, -8, 9};
		Arrays.sort(array);
		printArray("Sorted Array: ", array);
		
		int index = Arrays.binarySearch(array, 9);
		System.out.println("Vi tri cua 2 la : " + index);
		
	}
	
	private static void printArray(String massege, int[] array) {
		System.out.println(massege
				+ ": [length: " + array.length + "]");
		for(int i = 0; i < array.length; i++) {
			if(i != 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}

}
