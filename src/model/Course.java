package model;

public class Course {
	private static long count = 0;
	private long c_ID;
	private String title;
	private int creditPoints;
	private Professor professor;
	
	public Course() {
		title = "Course";
		creditPoints = 3;
		professor = new Professor();
		c_ID = count++;
	}
	
	public Course(String title, int creditPoints,  Professor professor) {
		this.title = title;
		this.creditPoints = creditPoints;
		this.professor = professor;
		c_ID = count++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCreditPoints() {
		return creditPoints;
	}

	public void setCreditPoints(int creditPoints) {
		this.creditPoints = creditPoints;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public long getC_ID() {
		return c_ID;
	}
	
	
}
