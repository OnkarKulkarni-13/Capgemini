package com.capg.helloworld;

public class SwitchCase {
	public static void main(String[] args) {
		// int a=3;
		String str = "mon";
		switch (str) {
		case "mon":
			System.out.println("Monday");
			break;

		case "tue":
			System.out.println("Tuesday");
			break;

		case "wed":
			System.out.println("Wenesday");
			break;

		case "thu":
			System.out.println("Thursday");
			break;

		case "fri":
			System.out.println("Friday");
			break;

		case "sat":
			System.out.println("Saturday");
			break;

		case "sun":
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Wrong Choice");

		}

	}

}
