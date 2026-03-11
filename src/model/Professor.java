package model;

import model.enums.Degree;

public class Professor extends Person{
	private static long count = 0;
	private long p_ID;
	private Degree degree;
	
	public Professor() {
		setName("Professor");
		setSurname("professor");
		setPersonCode("000000-00000");
		setDegree(Degree.other);
		p_ID = count++;
	}
	
	public Professor(String name, String surname, String personCode, Degree degree) {
		setName(name);
		setSurname(surname);
		setPersonCode(personCode);
		setDegree(degree);
		p_ID = count++;
	}

	public long getP_ID() {
		return p_ID;
	}

	public Degree getDegree() {
		return degree;
	}

	public void setDegree(Degree degree) {
		if (degree == null) {
			this.degree = Degree.other;
			return;
		}
		this.degree = degree;
	}
	
	public String toString() {
		return "Professor " + getName() + " " + getSurname() + " (" + getDegree() + ")";
	}
}

	