package com.Capg_Day9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int age;
	String name;
	int salary;
	public Employee(int age, String name, int salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
}

public class MyStreamEmployee {

	public static void main(String args[])
	{
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(new Employee(10, "Ansar", 1000));
		employeeList.add(new Employee(1, "Priya", 5000));
		employeeList.add(new Employee(2, "Kumar", 2000));
		employeeList.add(new Employee(100, "Anil", 8000));
		employeeList.add(new Employee(5, "Zee", 20000));
		
		
		//employeeList.stream().forEach(System.out::println);
		
		//Fetch all the employee and print name whose salary is greater than 5000
		
		List<Employee> filterEmployee=employeeList.stream().filter(e->e.getSalary()>=5000).collect(Collectors.toList());
		
		//print only name from list
		//filterEmployee.forEach(e->System.err.println(e.getName()));
		
		//Change the list of value to upper case and print name
		List<String> filterEmployeeUpperCase=	employeeList.stream().map(e->e.getName().toUpperCase()).collect(Collectors.toList());
		
		filterEmployeeUpperCase.forEach(e->System.out.println(e));
		
	IntSummaryStatistics state= employeeList.stream().mapToInt(e->(int)e.getSalary()).summaryStatistics();
		
	//find the maximum salary of employee
	System.out.println("max salary "+state.getMax());
	
	//find the minimum salary of employee
	System.out.println("min "+state.getMin());
	
	//find the sum of all the salary
	//total paid salary of company
	System.out.println("sum "+state.getSum());
	
	
	//find the avg salary
	System.out.println("Avg "+state.getAverage());
	
	
	//sorting of user defined data type
	//mployee cannot be cast to java.lang.Comparable
	//sorting alog
	List<Employee> ls=employeeList.stream().sorted(new Comparator<? super Employee>()).collect(Collectors.toList());
	ls.forEach(System.out::println);
	
	
	}
	
	
}
