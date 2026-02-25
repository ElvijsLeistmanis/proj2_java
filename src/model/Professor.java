package model;

public class Professor {
	private static long count = 0;
	private long p_ID;
	private String name;
	private String surname;
	private String degree;
	
	public Professor() {
		name = "Professor";
		surname = "professor";
		degree = "bsc";
		p_ID = count++;
	}
	
	public Professor(String name, String surname, String degree) {
		this.name = name;
		this.surname = surname;
		this.degree = degree;
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

	public String getDegree() {
		return degree;
	}

	public void setName(String name) {
		if(name == null || name.isEmpty() || !(name.matches("[A-Z]{1}[a-z]{2,10}"))) {
			this.name = "Professor";
		}
		this.name = name;
	}

	public void setSurname(String surname) {
		if(surname == null || surname.isEmpty() || !(surname.matches("[A-Z]{1}[a-z]{2,10}"))) {
			this.surname = "professor";
		}
		this.surname = surname;
	}

	public void setDegree(String degree) {
		if (degree == null || degree.isEmpty()) {
			this.degree = "bsc";
		}
		this.degree = degree;
	}
	
	public String toString() {
		return name + " " + surname + " (" + degree + ")";
	}
}

	