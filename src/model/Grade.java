package model;

public class Grade {
	private static long count = 200000;
	private long g_ID;
	private int value;
	private Student student;
	private Course course;
	
	public Grade() {
		setValue(1);
		setStudent(new Student());
		setCourse(new Course());
		g_ID = count++;
	}
	
	public Grade(int value, Student student, Course course) {
		setValue(value);
		setStudent(student);
		setCourse(course);
		g_ID = count++;
	}

	public long getG_ID() {
		return g_ID;
	}

	public int getValue() {
		return value;
	}

	public Student getStudent() {
		return student;
	}

	public Course getCourse() {
		return course;
	}

	public void setValue(int value) {
		if (value < 0 || value > 10) {
			this.value = 1;
			return;
		}
		this.value = value;
	}

	public void setStudent(Student student) {
		if(student == null) {
			this.student = new Student();
			return;
		}
		this.student = student;
	}

	public void setCourse(Course course) {
		if (course == null) {
			this.course = new Course();
			return;
		}
		this.course = course;
	}
	
	public String toString() {
		return course.getTitle() + ": " + value + " (" +student.getName() + " " + student.getSurname() + ")";
	}
}
