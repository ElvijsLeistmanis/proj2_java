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

	public long getC_ID() {
		return c_ID;
	}

	public String getTitle() {
		return title;
	}

	public int getCreditPoints() {
		return creditPoints;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setTitle(String title) {
		if(title == null || title.isEmpty()) {
			this.title = "Title";
		}
		this.title = title;
	}

	public void setCreditPoints(int creditPoints) {
		if(creditPoints < 0 || creditPoints > 30) {
			this.creditPoints = 3;
		}
		this.creditPoints = creditPoints;
	}

	public void setProfessor(Professor professor) {
		if(professor == null) {
			this.professor = new Professor();
		}
		this.professor = professor;
	}

	public String toString() {
		return "Course " + title + " (" + creditPoints + ") " + professor.toString();
	}
}
