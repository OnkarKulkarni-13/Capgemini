package com.student.Studentinfo;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("stringbean.xml");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");

		System.out.println();
		Student student = context.getBean("student1", Student.class);
		System.out.println("Student Name:- " + student.getName());
		System.out.println("Student RollNo:- " + student.getRollNo());
		System.out.println("Student mobileno:- " + student.getPhoneNos());
		System.out.println("Student courses:- " + student.getCourses());
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");

		System.out.println();
		System.out.println("Printing phone numbers in linear form");
		for (Integer s : student.getPhoneNos()) {
			System.out.println(s);
		}
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");

		System.out.println();
		System.out.println("Printing courses in linear form");
		Set<String> set = student.getCourses();
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");

		System.out.println();
		System.out.println("Printing Employee data which contains student Object:- ");
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println("Employee I'd:- " + employee.getId());
		System.out.println("Employee Salary:- " + employee.getSalary());
		System.out.println("Student Name:- " + employee.getStudent().getName());
		System.out.println("Student RollNo:- " + employee.getStudent().getRollNo());
		System.out.println("Student Courses:- " + employee.getStudent().getCourses());
		System.out.println("Students PhoneNos:- " + employee.getStudent().getPhoneNos());
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");

		Manager manager = context.getBean("manager", Manager.class);
		System.out.println("ManagerName:- " + manager.getName());
		System.out.println("Department:- " + manager.getDepartment());
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");

		Boy boy = context.getBean("boy", Boy.class); // Here we are using @Configuration Annotation.
														// That's why Object name(i'd) will be similar as Class name but
														// in camelCase form.

		System.out.println("Name of boy:- " + boy.getName());
		System.out.println("Roll No of boy:- " + boy.getRollNo());
		System.out.println("Batch I'd:- " + boy.getBatchId());

	}
}
