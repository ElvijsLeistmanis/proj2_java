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
	
}
