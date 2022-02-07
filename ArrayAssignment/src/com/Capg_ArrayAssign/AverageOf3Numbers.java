package com.Capg_ArrayAssign;
//3.Write a program to find average of 3 numbers:-

import java.util.Scanner;

public class AverageOf3Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 1st number:- ");
		int a = sc.nextInt();
		System.out.println("Enter your 2nd number:- ");
		int b = sc.nextInt();
		System.out.println("Enter your 2nd number:- ");
		int c = sc.nextInt();
		System.out.println("Average of your entered 3 numbers is:- " + (a + b + c) / 3);
	}

}
