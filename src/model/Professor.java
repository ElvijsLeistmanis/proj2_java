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
		if (name == null || surname == null || degree == null) {
			
		}
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
		if (name == null) {
			
		}
		this.name = name;
	}

	public void setSurname(String surname) {
		if (name == null) {
			
		}
		this.surname = surname;
	}

	public void setDegree(String degree) {
		if (name == null) {
			
		}
		this.degree = degree;
	}
	
	public String toString() {
		return name + " " + surname + " (" + degree + ")";
	}
}

	