package com.Capg_StringAssign;
//6.Write a program to convert String to Integer:-

public class Convert_String_Int {
	public static void main(String[] args) {
		int decimalExample = Integer.parseInt("20");
		System.out.println(decimalExample);

		int signedPositiveExample = Integer.parseInt("+20");
		System.out.println(signedPositiveExample);

		int signedNegativeExample = Integer.parseInt("-20");
		System.out.println(signedNegativeExample);

		int radixExample = Integer.parseInt("20", 16);
		System.out.println(radixExample);

	}

}
