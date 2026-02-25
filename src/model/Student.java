package model;

public class Student {
	private static long count = 10000;
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
		if(name == null || name.isEmpty() || !(name.matches("[A-Z]{1}[a-z]{2,10}"))) {
			this.name = "Student";
		}
		this.name = name;
	}

	public void setSurname(String surname) {
		if(surname == null || surname.isEmpty() || !(surname.matches("[A-Z]{1}[a-z]{2,10}"))) {
			this.surname = "Student";
		}
		this.surname = surname;
	}
	
	public void setPersonCode (String personCode) {
		if(personCode == null || personCode.isEmpty() || !(personCode.matches("[0-9]{6}-[0-9]{5}"))) {
			this.personCode = "000000-00000";
		}
		this.personCode = personCode;
	}
	
	public String toString() {
		return "Student " + name + " " + surname + " (" + personCode + ")";
	}
}
