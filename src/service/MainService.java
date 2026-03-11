package service;

import java.util.ArrayList;

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
		
		System.out.println("-------------------");
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
		ArrayList<Professor> professorList = new ArrayList<Professor>();
		professorList.add(professor1);
		professorList.add(professor2);
		professorList.add(professor3);
		
		ArrayList<Course> courseList = new ArrayList<Course>();
		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		
		ArrayList<Grade> gradeList = new ArrayList<Grade>();
		gradeList.add(grade1);
		gradeList.add(grade2);
		gradeList.add(grade3);
		
		System.out.println(student2 + ": " + avgGrade(gradeList, student2));
		System.out.println(student2 + ": " + weightedAvgGrade(gradeList, student2));
	}
	
	public static double avgGrade(ArrayList<Grade> gradeList, Student student) {
		int gradeCount = 0, gradeTotal = 0;
		for(Grade grade : gradeList) {
			if (grade.getStudent().equals(student)) {
				gradeTotal += grade.getValue();
				gradeCount++;
			}
		}
		
		return gradeTotal / gradeCount;
	}
	
	public static double weightedAvgGrade(ArrayList<Grade> gradeList, Student student) {
		int ectsTotal = 0, gradeTotal = 0;
		for(Grade grade : gradeList) {
			if (grade.getStudent().equals(student)) {
				gradeTotal += grade.getValue() * grade.getCourse().getCreditPoints();
				ectsTotal += grade.getCourse().getCreditPoints();
			}
		}
		
		return gradeTotal / ectsTotal;
	}

}
