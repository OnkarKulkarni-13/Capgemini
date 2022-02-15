package com.Capg_Day7;

import java.util.*;

public class CollectionListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		// Adding Elements to List:-
		list.add("Onkar");
		list.add("Vyankatesh");
		list.add("Ram");
		list.add("Sham");

		// Taking the iterator class:-

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Removing the Vyankateshfrm list:-");
		list.remove("Vyankatesh");
		System.out.println(list);
		
		list.forEach(System.err::println);
		
	}
	

}
