package com.Capg_StringAssign;
//3.Write a program to Count the number of words in a given string sentence:-

import java.util.Scanner;

public class CountNumberOfWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string:- ");
		String str = sc.nextLine();

		// Method-1
		System.out.println("Length of your entered string:- " + str.length());

		// Method-2
		char[] ch = str.toCharArray(); // this will convert String to character array....!!!
		int i = 0;

		for (i = 0; i < ch.length; i++) {
		}
		System.out.println("Length of your entered string:- " + i);

	}

}
