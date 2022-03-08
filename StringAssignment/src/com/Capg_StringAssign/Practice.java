package com.Capg_StringAssign;

public class Practice {
	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer("abba");
		StringBuffer bf = new StringBuffer(s1);
		bf.reverse();
	    String s2= bf.toString();
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		
		System.out.println();
		String s3 = "Onkar Sudhir Kulkarni";
		//System.out.println(s3.trim());
		System.out.println("Printing in reversed order:- ");
		int len = s3.length();
		for(int i=len-1;i>=0;i--) {
			System.out.print(s3.charAt(i));
		}
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("tOOGLE cASE:- ");
		String[] words = s3.split("\\s");
		String toggle = "";
		
		for(String s: words) {
			String first = s.substring(0,1);
			
			String remain = s.substring(1);
			remain.toUpperCase();
			toggle = toggle + first.toLowerCase()+ remain.toUpperCase()+" ";
		}
		System.out.println(toggle);
		
		
		/*if(s2.equals(s1)) {
			System.out.println("Pallindrome String");
		}
		else {
			System.out.println("Not A Pallindrome String");
		}
	//	String s2 = new String("Onkar");
		
		/*System.out.println("Comparing Two Objects using .equals method:- ");
		System.out.println(s1.equals(s2));
		System.out.println();
		
		System.out.println("Comparing Two Objects using == operator:- ");
		System.out.println(s1==s2);
		System.out.println();
		
		StringBuffer sb = new StringBuffer("Onkar Kulkarni");
		System.out.println(sb);
		
		System.out.println("After Appending:-");
		sb.append(" Vyankatesh Kulkarni ");
		System.out.println(sb);
		System.out.println();
		
		System.out.println("After inserting:-");
		sb.insert(5,"Sudhir");
		System.out.println(sb);
		System.out.println();
		
		System.out.println("After Deleting:-");
		sb.delete(21, 31);
		System.out.println(sb);
		System.out.println();
		
		System.out.println(sb.capacity()); 
		System.out.println();
		
		System.out.println();
		*/
		
	}


}
