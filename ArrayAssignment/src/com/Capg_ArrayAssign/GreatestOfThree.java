package com.Capg_ArrayAssign;
//Write a program to find greatest of three numbers:-

public class GreatestOfThree {
	public static void main(String[] args) {
		int a = 10, b = 40, c = 30;
		if (a > b && a > c) {
			System.out.println("greatest number is :- " + a);
		} else {
			if (b > c) {
				System.out.println("greatest number is :- " + b);
			} else {
				System.out.println("greatest number is :- " + c);
			}

		}
	}

}
