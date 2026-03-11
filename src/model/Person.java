package model;

public class Person {
	private String name;
	private String surname;
	private String personCode;
	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getPersonCode() {
		return personCode;
	}
	
	public void setName(String name) {
		if(name == null || name.isEmpty() || !(name.matches("[A-Z]{1}[a-z]{2,10}"))) {
			this.name = "Person";
			return;
		}
		this.name = name;
	}

	public void setSurname(String surname) {
		if(surname == null || surname.isEmpty() || !(surname.matches("[A-Z]{1}[a-z]{2,10}"))) {
			this.surname = "Person";
			return;
		}
		this.surname = surname;
	}
	
	public void setPersonCode (String personCode) {
		if(personCode == null || personCode.isEmpty() || !(personCode.matches("[0-9]{6}-[0-9]{5}"))) {
			this.personCode = "000000-00000";
			return;
		}
		this.personCode = personCode;
	}
	
	public Person() {
		setName("Person");
		setSurname("Person");
		setPersonCode("000000-00000");
	}
	
	public Person(String name, String surname, String personCode) {
		setName(name);
		setSurname(surname);
		setPersonCode(personCode);
	}
	
	public String toString() {
		return name + " " + surname + " (" + personCode + ")";
	}
}
