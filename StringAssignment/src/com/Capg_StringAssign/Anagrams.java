package com.Capg_StringAssign;
//9.Write a program to check if two strings are anagrams of each other:-

import java.util.Scanner;

public class Anagrams {
	public static void main(String[] args) {
		int num_of_chars = 256;
		int[] charArray = new int[num_of_chars];
		boolean isAnagram = true;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st String:- ");
		String str1 = sc.nextLine();
		System.out.print("Enter 2nd String:- ");
		String str2 = sc.nextLine();

		if (str1.length() != str2.length()) {
			isAnagram = false;
			System.out.println("Not anagram");
		} else {
			for (int i = 0; i < str1.length(); i++) {
				charArray[str1.charAt(i)]++;
			}

			for (int i = 0; i < str2.length(); i++) {
				charArray[str2.charAt(i)]--;
			}

			for (int i = 0; i < num_of_chars; i++) {
				if (charArray[i] != 0) {
					System.out.println("Not anagram");
					isAnagram = false;
					break;
				}
			}
		}

		if (isAnagram) {
			System.out.println("It is anagram");
		}
	}

}
