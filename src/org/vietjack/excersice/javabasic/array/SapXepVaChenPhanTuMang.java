package org.vietjack.excersice.javabasic.array;

import java.util.Arrays;

public class SapXepVaChenPhanTuMang {
	public static void main(String[] args) {
		int array[] = {2, 4, 8, -3, 7, -9, 1, -6};
		Arrays.sort(array);
		printArray(array);
	}
	
	public static void printArray(int[] array) {
		int arrLength = array.length;
		System.out.println("Array of length: " + arrLength);
		System.out.print("Array[] : {");
		for(int i = 0; i < arrLength; i++) {
			System.out.print(array[i] +  " ");
		}
		System.out.println(" }");
	}

}
