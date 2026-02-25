package service;

import model.Student;

public class MainService {

	public static void main(String[] args) {
		Student student1 = new Student();
		System.out.println(student1);
		Student student2 = new Student("Elvijs", "Leistmanis", "291849-10231");
		System.out.println(student2);
		Student student3 = new Student("29123", "l2istmanis", null);
		System.out.println(student3);
	}

}
