package com.capg.helloworld;

import java.util.Scanner;

public class SumOf2Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your two numbers:- ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int sum = a + b;
		System.out.println("Sum of two number is :- " + sum);
		// System.out.println(" \" We are writing the hello world\"");

	}

}
