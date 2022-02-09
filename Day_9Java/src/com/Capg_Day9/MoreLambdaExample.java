package com.Capg_Day9;

import java.util.*;

interface CombineToString{
	public String combine(String str1, String str2);
}

interface Fibonacciseries{
	public void fibonacci(int num);
}

interface CharToNumber{
	public int convertToNum(char ch);
}

interface MaxNumber{
	public void max(int arr[], int size);
}

interface MinNumber{
	public void min(int arr[], int size);
}

interface SumOfValue{
	public void sum(int arr[], int size);
}

interface AverageOfValue{
	public void average(int arr[], int size);
}

public class MoreLambdaExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. Creating lambda method to combine to Strings:-
		CombineToString str = (str1,str2)->{
			String result = str1+str2;
			return result;
			
		};
		System.out.println("1. Combining your two strings str1 = Onkar and str2= Kulkarni");
		System.out.println("After Combination:- "+str.combine("Onkar","Kulkarni"));
		
		System.out.println("---------------------------------------------------------------------------------------------");
	
		//2. Creating lambda method to print Fibonacci series:-
		System.out.println("2. Printing the fibonacci series :- ");
		 Fibonacciseries f1 = (num)->{
			 int a=0,b=1,c;
			 while(a<num) {
			 System.out.print(a+" ");
			 c=a+b;
			 a=b;
			 b=c;
			 }
		 };
		f1.fibonacci(100);
		System.out.println();
		
		System.out.println("---------------------------------------------------------------------------------------------");
		
	//3. Creating lambda method to print Ascii value of given Character:-
		System.out.println("3. Printing ascci value of given input Character");
		CharToNumber res = (ch)->{
			return (int)ch;
		};
		System.out.println("Printing Ascii value of entered character:- "+res.convertToNum('z'));
		
		System.out.println("---------------------------------------------------------------------------------------------");
		
	//4. Creating the lambda method to print Largest numbers:-
		System.out.println("4. Printing Largest value from the given  array:- ");
		MaxNumber print = (arr, size)->{
			int max = arr[0];
			for(int i=1;i<size;i++) {
				if(max<arr[i]) {
					max=arr[i];
				}
			}
			System.out.println("Largest element is:- "+max);
			
		};
		int[] arr = {23,32,34,11,46,90};
		print.max(arr, arr.length);
		
		System.out.println("---------------------------------------------------------------------------------------------");
		
		//5. Creating the lambda method to print Smallest numbers:-
			System.out.println("5. Printing Largest value from the given  array:- ");
			MinNumber print1 = (arr1, size)->{
				int min = arr1[0];
				for(int i=1;i<size;i++) {
					if(min>arr1[i]) {
						min=arr1[i];
					}
				}
				System.out.println("Largest element is:- "+min);
				
			};
			int[] arr1 = {23,32,34,11,46,90};
			print1.min(arr1, arr1.length);
			
		System.out.println("---------------------------------------------------------------------------------------------");
			
			
	//6. Creating the lambda method to print Sum Of numbers:-
			System.out.println("6. Printing the Sum of values from the given  array:- ");
			SumOfValue s1 = (arr2,size)->{
				int sum=0;
				for(int i=0;i<size;i++) {
					sum=sum+arr2[i];
				}
				System.out.println("Printing the sum of "+size+" values:- "+sum);
				
				
			};
			int[] arr2 = {262,12,154,634,470,46,190};
			s1.sum(arr2, arr2.length);
			
	
	
	
	System.out.println("---------------------------------------------------------------------------------------------");
		
		
//7. Creating the lambda method to print Average Of numbers:-
		System.out.println("7. Printing the Average of values from the given  array:- ");
		AverageOfValue avg = (arr3,size)->{
			int sum=0;
			for(int i=0;i<size;i++) {
				sum=sum+arr3[i];
			}
			System.out.println("Printing the Average of "+size+" values:- "+sum/arr3.length);
			
			
		};
		int[] arr3 = {262,12,154,634,470,46,190};
		avg.average(arr3, arr3.length);
		
}

	
 
}	


