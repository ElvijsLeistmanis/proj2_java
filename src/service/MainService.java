package service;

import java.util.ArrayList;
import java.util.Arrays;

import model.Course;
import model.Grade;
import model.Person;
import model.Professor;
import model.Student;
import model.enums.Degree;

public class MainService {
	
	private static ArrayList<Student> studentList = new ArrayList<Student>();
	private static ArrayList<Grade> gradeList = new ArrayList<Grade>();
	private static ArrayList<Course> courseList = new ArrayList<Course>();
	private static ArrayList<Professor> professorList = new ArrayList<Professor>();
	
	
	
	public static void main(String[] args) {
		Student student1 = new Student();
		System.out.println(student1);
		Student student2 = new Student("Elvijs", "Leistmanis", "291849-10231");
		System.out.println(student2);
		Student student3 = new Student("29123", "l2istmanis", null);
		System.out.println(student3);
		
		System.out.println("-------------------");
		
		Professor professor1 = new Professor();
		Professor professor2 = new Professor("Karina", "Skirmante", "291924-19284", Degree.master);
		Professor professor3 = new Professor("943290-", "S93nte", " ", null);
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
		Grade grade4 = new Grade (9, student1, course2);
		System.out.println(grade1);
		System.out.println(grade2);
		System.out.println(grade3);
		
		System.out.println("-------------------");
		
		studentList.addAll(Arrays.asList(student1, student2, student3));
		professorList.addAll(Arrays.asList(professor1, professor2, professor3));
		courseList.addAll(Arrays.asList(course1, course2, course3));
		gradeList.addAll(Arrays.asList(grade1, grade2, grade3));

		System.out.println("-------------------");
		
		System.out.println(student2 + ": " + avgGrade(student2));
		System.out.println(student2 + ": " + weightedAvgGrade(student2));
		System.out.println(course2 + ": " + avgCourseGrade(course2));
		System.out.println(professor2 + ": " + coursesPerProfessor(professor2));
		sortByGrade();
		
		System.out.println("-------------------");
		
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(student1);
		personList.add(student2);
		personList.add(professor1);
		personList.add(professor2);
		
		System.out.println(personList);
	}
	
	public static double avgGrade( Student student) {
		int gradeCount = 0, gradeTotal = 0;
		for(Grade grade : gradeList) {
			if (grade.getStudent().equals(student)) {
				gradeTotal += grade.getValue();
				gradeCount++;
			}
		}
		
		if (gradeCount == 0) return 0;
		return gradeTotal / gradeCount;
	}
	
	public static double weightedAvgGrade(Student student) {
		int ectsTotal = 0, gradeTotal = 0;
		for(Grade grade : gradeList) {
			if (grade.getStudent().equals(student)) {
				gradeTotal += grade.getValue() * grade.getCourse().getCreditPoints();
				ectsTotal += grade.getCourse().getCreditPoints();
			}
		}
		
		if (ectsTotal == 0) return 0;
		return gradeTotal / ectsTotal;
	}
	
	public static double avgCourseGrade(Course course) {
		int gradeCount = 0, gradeTotal = 0;
		for(Grade grade : gradeList) {
			if (grade.getCourse().equals(course)) {
				gradeTotal += grade.getValue();
				gradeCount++;
			}
		}
		
		if (gradeCount == 0) return 0;
		return gradeTotal / gradeCount;
	}
	
	public static int coursesPerProfessor(Professor professor) {
		int courseCount = 0;
		for(Course course : courseList) {
			if (course.getProfessor().equals(professor)) {
				courseCount++;
			}
		}
		return courseCount;
	}
	
	public static void sortByGrade() {
		studentList.sort((student1, student2) -> Double.compare(weightedAvgGrade(student2), weightedAvgGrade(student1)));
		for (Student student : studentList) {
			System.out.println(student.getName() + " " + student.getSurname() + ": " + weightedAvgGrade(student));
		}
	}
	
	public void createStudent (String name, String surname, String personCode) throws Exception {
		for(Student student : studentList) {
			if (student.getPersonCode().equals(personCode)) {
				throw new Exception("Student already exists.");
			}
			
			studentList.add(new Student(name, surname, personCode));
		}
	}

}
