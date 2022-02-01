package com.capg.helloworld;

import java.util.Scanner;

public class MultiplicationOf2No {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your two numbers:- ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int mul = a * b;
		System.out.println("Sum of two number is :- " + mul);
		// System.out.println(" \" We are writing the hello world\"");

	}

}
