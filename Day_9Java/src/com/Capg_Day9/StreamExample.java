package com.Capg_Day9;
import java.util.*;
import java.util.stream.Stream;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		//Stream API:- it is an interface present in java.util.stream;
		//Stream API:- use to process on Collection & Group of object also.
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(121);
		list.add(200);
		list.add(312);
		list.add(10);
		System.out.println(list);
		System.out.println("-------------------------------------------------------------------------------");
		
		//Using Stream Api:-
		Stream<Integer> stream = list.stream();
		
		//1.Printing the stream:-
		// use list.stream().   --- if you use stream. directly then it will give error stram already used
		System.out.println("Printing your stream:- ");
		list.stream().forEach(System.err::println);
		//list.stream().forEach(e->System.out.println(e));   -->> printing elements using lambda method
		System.out.println("-------------------------------------------------------------------------------");
		
		//2.Printing number of elements present in stream:-
		System.out.println("Printing the count of elements:- ");
		long count=list.stream().count();
		System.out.println(count);
		System.out.println("-------------------------------------------------------------------------------");
		
		//3.Printing elements in sorted form:-
		System.out.println("Printing stream element in sorted form:- ");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("-------------------------------------------------------------------------------");
		
		//Filter(Predicate) Method:- return boolean either "True" or "False"
		
		//4.Printing Even Numbers:-
	    List<Integer> newlist =	list.stream().filter(i->i%2==0).collect(Collectors.toList()); 
		//boolean value function in filter method (predicate -- boolean value function)
	    System.out.println("Printing Only even values from stream:- "+newlist);
	    System.out.println("-------------------------------------------------------------------------------");
		
	    //5.Printing Values Greater than 50:-
	    List<Integer> newlist1 =list.stream().filter(i->i>50).collect(Collectors.toList()); 
		System.out.println("Printing values greater than 50 from stream:- "+newlist1);
		System.out.println("-------------------------------------------------------------------------------");
		
		//Map(Function) Method:- return the element/value directly:-
		
		//6.Printing Square of the numbers present into the stream:-
		List<Integer>newlist2 = list.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println("Printing the square of values present in the stream:- "+newlist2);
		System.out.println("-------------------------------------------------------------------------------");
		
		//7.Example of IntSummaryStatistics:-
		IntSummaryStatistics state=list.stream().mapToInt(x->x).summaryStatistics();
        System.out.println("Max element in stream:- "+state.getMax());
        System.out.println("Min element in stream:- "+state.getMin());
	}

}
