package com.capg.helloworld;

import java.util.Scanner;

public class SumOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No. of elements your going enter :- ");
		int count = sc.nextInt();
		
		int sum = 0;
		
		System.out.println();
		if(count==0) {
			System.out.println("No elements to sum");
			return;
		}
		if(count<0) {
			System.out.println("Invalid number of elements");
			return;
		}
		
		System.out.println("Enter your "+count+" number:-");
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];

		}
		System.out.println("Sum of your entered numbers :- " + sum);
	}

}
