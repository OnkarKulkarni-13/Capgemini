package com.capg.helloworld;

import java.util.Scanner;

public class IfElseLadder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your avg Score :- ");
		float avg = sc.nextFloat();
		if (avg >= 80.0f) {
			System.out.println("A+ -Grade");
		}

		else if (avg >= 65.0f) {
			System.out.println("A-Grade");
		}

		else if (avg >= 50.0f) {
			System.out.println("B-Grade");
		}

		else if (avg >= 40.0f) {
			System.out.println("C-Grade");
		}

		else {
			System.out.println("Fail");
		}

	}

}
