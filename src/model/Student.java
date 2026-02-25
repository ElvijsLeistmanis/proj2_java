package model;

public class Student {
	private static int count = 10000;
	private long st_ID;
	private String name;
	private String surname;
	private String personCode;
	
	public Student() {
		name = "Student";
		surname = "student";
		personCode = "000000-00000";
		st_ID = count++;
	}
	
	public Student(String name, String surname, String personCode) {
		if (name == null || surname == null || personCode == null) {
			
		}
		
		this.name = name;
		this.surname = surname;
		this.personCode = personCode;
		st_ID = count++;
	}

	public long getSt_ID() {
		return st_ID;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}
	
	public String getPersonCode () {
		return personCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setPersonCode (String personCode) {
		this.personCode = personCode;
	}
	
	public String toString() {
		return "Student " + name + " " + surname + " (" + personCode + ")";
	}
}
