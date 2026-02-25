package model;

import model.enums.Degree;

public class Professor {
	private static long count = 0;
	private long p_ID;
	private String name;
	private String surname;
	private Degree degree;
	
	public Professor() {
		setName("Professor");
		setSurname("professor");
		setDegree(Degree.other);
		p_ID = count++;
	}
	
	public Professor(String name, String surname, Degree degree) {
		setName(name);
		setSurname(surname);
		setDegree(degree);
		p_ID = count++;
	}

	public long getP_ID() {
		return p_ID;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Degree getDegree() {
		return degree;
	}

	public void setName(String name) {
		if(name == null || name.isEmpty() || !(name.matches("[A-Z]{1}[a-z]{2,10}"))) {
			this.name = "Professor";
			return;
		}
		this.name = name;
	}

	public void setSurname(String surname) {
		if(surname == null || surname.isEmpty() || !(surname.matches("[A-Z]{1}[a-z]{2,10}"))) {
			this.surname = "professor";
			return;
		}
		this.surname = surname;
	}

	public void setDegree(Degree degree) {
		if (degree == null) {
			this.degree = Degree.other;
			return;
		}
		this.degree = degree;
	}
	
	public String toString() {
		return name + " " + surname + " (" + degree + ")";
	}
}

	