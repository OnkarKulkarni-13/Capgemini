package com.Capg_Day5;

import java.util.Scanner;

public class RemoveElement {
	public static void removeChar(String s, char ch) {
		int count=0, n=s.length(),i, j;
		char[] str = s.toCharArray();
		
		
		for( i=0,j=0;i<n;i++) {
			if(str[i]!=ch) {
				str[j++]=str[i];
				count++;
				
				
			}
			
			
		}
		str[j]='\0';
		if(count!=0) {
			System.out.println("Printing the string after removing character "+ch+":- ");
			for(i=0;i<str.length;i++) {
				System.out.print(str[i]);
			}
		}
		else {
			System.out.println("You have entered the character which is not present in the string");
		}
				

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String:- ");
		String str = sc.nextLine();
		//sc.next();
		System.out.print("Enter Character to be removed:-");
		char ch = sc.next().charAt(0);
		removeChar(str, ch);

	}

}
