package com.capg.helloworld;

public class ConcatinateArray {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 100, 200, 300, 400, 500 };
		int len1 = arr1.length;
		int len2 = arr2.length;
		int len = len1 + len2;
		int[] arr3 = new int[len];
		System.out.println("Length of an 3rd array :- "+len);

		
		// Concatenating Two Array:-
		for (int i = 0; i < len1; i++) {
			arr3[i] = arr1[i];
			arr3[i + len1] = arr2[i];
		}

		// Printing Concatenated ARRAY:-
		for (int i = 0; i < len; i++) {
			System.out.print(arr3[i]+" ");
		}

	}

}
