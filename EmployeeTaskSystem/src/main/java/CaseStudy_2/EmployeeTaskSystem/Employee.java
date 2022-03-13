package CaseStudy_2.EmployeeTaskSystem;

import java.util.List;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String department;
	private String designation;
	private String password;
	private String superior;
	private List<Task> tasklist;
	private List<Attendance> AttendanceList;
	private Rating rating;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, String department, String designation, String password,
			String superior, List<Task> tasklist, List<Attendance> attendanceList, Rating rating) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.designation = designation;
		this.password = password;
		this.superior = superior;
		this.tasklist = tasklist;
		AttendanceList = attendanceList;
		this.rating = rating;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSuperior() {
		return superior;
	}

	public void setSuperior(String superior) {
		this.superior = superior;
	}

	public List<Task> getTasklist() {
		return tasklist;
	}

	public void setTasklist(List<Task> tasklist) {
		this.tasklist = tasklist;
	}

	public List<Attendance> getAttendanceList() {
		return AttendanceList;
	}

	public void setAttendanceList(List<Attendance> attendanceList) {
		AttendanceList = attendanceList;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	
	
	
	
	
	
	
	
	
	

}
