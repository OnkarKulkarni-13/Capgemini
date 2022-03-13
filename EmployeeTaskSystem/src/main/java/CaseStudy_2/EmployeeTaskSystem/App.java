package CaseStudy_2.EmployeeTaskSystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		System.out.println(
				"--------------------------------------------------------------------------------------------");

		Employee employee = context.getBean("employee", Employee.class);
		System.out.println("Employee name:- " + employee.getEmployeeId());
		System.out.println("Employee I'd:- " + employee.getEmployeeName());
		System.out.println("Department:- " + employee.getDepartment());
		System.out.println("Designation:- " + employee.getDesignation());
		System.out.println("Password:- " + employee.getPassword());
		System.out.println("Superior:- " + employee.getSuperior());
		System.out.println(
				"--------------------------------------------------------------------------------------------");
		System.out.println();

		for (Task t : employee.getTasklist()) {
			System.out.println("TaskId:- " + t.getTaskId());
			System.out.println("TaskName:- " + t.getTaskName());
			System.out.println("TaskDescription:- " + t.getTaskDescription());
			System.out.println("DateOfAllocation:- " + t.getDateOfAllocation());
			System.out.println("Deadline:- " + t.getDeadline());
			System.out.println();
			
		}
		System.out.println(
				"--------------------------------------------------------------------------------------------");
		System.out.println();

		for (Attendance a : employee.getAttendanceList()) {
			System.out.println("Attendance Id    : " + a.getAttendanceId());
			System.out.println("Attendance Date  : " + a.getAttendanceDate());
			System.out.println("Attendance Status: " + a.getStatus());
			System.out.println();
		}
		System.out.println(
				"--------------------------------------------------------------------------------------------");
		System.out.println();

		System.out.println("Employee Rating      : " + employee.getRating());
		System.out.println(
				"--------------------------------------------------------------------------------------------");
		System.out.println();

	}
}
