package model;

public class Student extends Person{
	private static long count = 10000;
	private long st_ID;

	public Student() {
		super();
		st_ID = count++;
	}
	
	public Student(String name, String surname, String personCode) {
		super(name, surname, personCode);
		st_ID = count++;
	}

	public long getSt_ID() {
		return st_ID;
	}

	public String toString() {
		return "Student " + getName() + " " + getSurname() + " (" + getPersonCode() + ")";
	}
}
