package com.Capg_StringAssign;
//5.Write a program to check if a string is a palindrome or not :-

import java.util.Scanner;

public class PalindromeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string:- ");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		int len = str.length();
		int j = len - 1;
		for (int i = 0; i < len; i++) {
			if (ch[i] == ch[j]) {
				j--;

			} else {
				System.out.println("Not a Pallindrome String");
				return;
			}

		}
		System.out.println("Pallindrome String");
	}
}
//121 -- 121, 1331--1331
//abba - abba
// StringBuffer str1 = new StringBuffer(str); ---->>>>>>
// str1.reverse();

/*
 * if(str.compareTo(str1)) ------->>>>> this is not valid we can't compare
 * String with StringBuffer { System.out.println("Palindrome String");
 * 
 * }
 */
