package com.Capg_Day9;

interface PositiveOrNot {
	public void check(int a);
}

interface SquareOfNumber {
	public void square(int a);
}

interface UpperCase {
	public void string(String str);
}

public class LambdaMethod {
	public static void main(String[] args) {
		int a = 10;

		// 1. Lambda Function to check whether the number is positive or not. :-
		PositiveOrNot result = (num) -> {
			if (num >= 0) {
				System.out.println("Entered number " + num + "is a Positive Number");
			} else {
				System.out.println("Entered number " + num + "is a Negative Number");
			}

		};
		result.check(10);

		// 2. Lambda Function to check square of a number. :-
		SquareOfNumber value = (num) -> {
			System.out.println("Square of a given number " + num + " :- " + num * num);

		};
		value.square(12);

		// 3. Lambda Function to Convert String to Upper case:-
		UpperCase string = (str) -> {
			System.out.println("Converting to upper case:- " + str.toUpperCase());

		};
		string.string("onkar");

	}

}
