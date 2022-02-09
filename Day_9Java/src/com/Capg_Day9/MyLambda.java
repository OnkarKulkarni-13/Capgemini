package com.Capg_Day9;

interface MyCode
{
public void print();	
}

interface MySum
{
public void sum(int a,int b);	
}

@FunctionalInterface
//functional interface- which contain only method
//@FunctionalInterface annottion
interface EvenOrODD
{
 public String findValue(int a);
}
public class MyLambda {

public static void main(String args[])
{   
	
	//storing the value into variable
	int a=10;
	System.out.println(a);
	
	//java 8 allow use to store the code (function )inside java vairable
	//pass the function or method to java code
	//Type is not allowed because it is going to store in variable(Access Modifier)
	//remove return type because whatever value you return i will understand 
	//method name -add lamda with method name ->
	//remove the method name because we are not calling variable name 
	//if you have lamda on rightside you must have interface 
	//java says if one line code is there you can remove opening and closing bracket
	//with code variable you will able to run ti
	MyCode code=()->System.out.println("My Method");
	//execute the code late
	code.print();
	
	MySum sum= (x,z)->{
		
		int c=x+z;
		System.out.println(c);
		};
     sum.sum(10, 20);
     
   
    System.out.println(evenOrOddValue(10));
    
    //will find the wheter number id even or odd
    //interface 
    //functional interface
   //function parameters you can also ignore 
    EvenOrODD  evenorOdd= number->
    {
    	 if(number%2==0)
    	 {
    	  return "Even "+number;   
    	 }
    	 else
    	 {
    		return "ODd "+number; 
    	 }
    	};

    	String str=evenorOdd.findValue(11);
    	System.out.println(str);
}


// No need to write the below methods again these are just for the explanation purpose:-

public static String evenOrOddValue(int a)
{
 if(a%2==0)
 {
  return "Even "+a;   
 }
 else
 {
	return "ODd "+a; 
 }
}

public void sum(int a, int b)
{
int c=a+b;
System.out.println(c);
}
public void print()
{
System.out.println("My Method");	
}

	
}