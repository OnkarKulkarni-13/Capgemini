package com.Capg_Day10;

interface InterfaceClass{
	public void Test();  //Pure Abstract Method
	
	//Default method:-
	default public void Print() {
		System.out.println("This is a default method");
		
	}
	
	//Static method:-
	static public void Method() {
		System.out.println("This is a static method");
	}
	
	
}

class Interface implements InterfaceClass{
	public void Test(){
		System.out.println("This is a Overriden abstract method");
		
	}
	
}

public class Default_Static_MethodsInInterface {
	public static void main(String[] args) {
		Interface i = new Interface();
		
		i.Print();                    // Default method
		InterfaceClass.Method();      //Static method can only be called using Class name.
		
	}

}
