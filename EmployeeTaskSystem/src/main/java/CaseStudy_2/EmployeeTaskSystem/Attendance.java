package CaseStudy_2.EmployeeTaskSystem;

import java.util.Date;

public class Attendance {
	private int attendanceId;
	private String attendanceDate;
	private Attendence_Types Status;
	
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Attendance(int attendanceId, String attendanceDate, Attendence_Types status) {
		super();
		this.attendanceId = attendanceId;
		this.attendanceDate = attendanceDate;
		Status = status;
	}

	public int getAttendanceId() {
		return attendanceId;
	}

	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}

	public String getAttendanceDate() {
		return attendanceDate;
	}

	public void setAttendanceDate(String attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	public Attendence_Types getStatus() {
		return Status;
	}

	public void setStatus(Attendence_Types status) {
		Status = status;
	}


	
	

}
