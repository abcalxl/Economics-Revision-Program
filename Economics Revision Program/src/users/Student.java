package users;

public class Student extends User {
	private int studentNumber;
	private String teacherName;
	
	public Student(String firstname, String lastname, String username, String password, int studentnumber, String teachername) {
		super(firstname, lastname, username, password);
		this.studentNumber = studentnumber;
		this.teacherName = teachername;
		
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
}
