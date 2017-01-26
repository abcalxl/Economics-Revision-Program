package users;

public class Teacher extends User {
	private boolean isTeacher;

	public Teacher(String firstname, String lastname, String username, String password, boolean isteacher) {
		super(firstname, lastname, username, password);
		this.setTeacher(isteacher);
		// TODO Auto-generated constructor stub
	}

	public boolean isTeacher() {
		return isTeacher;
	}

	public void setTeacher(boolean isTeacher) {
		this.isTeacher = isTeacher;
	}


}
