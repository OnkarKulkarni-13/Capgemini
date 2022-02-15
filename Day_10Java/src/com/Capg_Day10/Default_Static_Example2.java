package com.Capg_Day10;

interface Sayable {
	// Default method
	default void say() {
		System.out.println("Hello, this is default method");
	}

	// Abstract method
	void sayMore(String msg);

	// Static method
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}

public class Default_Static_Example2 implements Sayable {

	public void sayMore(String msg) { // implementing abstract method
		System.out.println(msg);
	}

	public static void main(String[] args) {
		Default_Static_Example2 dm = new Default_Static_Example2();
		dm.say(); // calling default method
		dm.sayMore("Hello, Calling the Abstract method"); // calling abstract method
		Sayable.sayLouder("Hello, Calling the Static method");

	}
}
