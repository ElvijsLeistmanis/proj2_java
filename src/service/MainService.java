package service;

import model.Course;
import model.Grade;
import model.Professor;
import model.Student;
import model.enums.Degree;

public class MainService {

	public static void main(String[] args) {
		Student student1 = new Student();
		System.out.println(student1);
		Student student2 = new Student("Elvijs", "Leistmanis", "291849-10231");
		System.out.println(student2);
		Student student3 = new Student("29123", "l2istmanis", null);
		System.out.println(student3);
		
		System.out.println("-------------------");
		
		Professor professor1 = new Professor();
		Professor professor2 = new Professor("Karina", "Skirmante", Degree.master);
		Professor professor3 = new Professor("943290-", "S93nte", null);
		System.out.println(professor1);
		System.out.println(professor2);
		System.out.println(professor3);
		
		System.out.println("-------------------");
		
		Course course1 = new Course();
		Course course2 = new Course("JAVA", 6, professor2);
		Course course3 = new Course(null, -1, null);
		System.out.println(course1);
		System.out.println(course2);
		System.out.println(course3);
		
		System.out.println("-------------------");
		
		Grade grade1 = new Grade();
		Grade grade2 = new Grade(6, student2, course2);
		Grade grade3 = new Grade(11, student2, null);
		System.out.println(grade1);
		System.out.println(grade2);
		System.out.println(grade3);
	}

}
