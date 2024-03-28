package q613;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
//		Student s1 = new Student();
//		s1.setName(name);
//		s1.setSchool(school);
//		s1.setGrade(grade);
		Student s2 = new Student(name, school, grade);
		
//		System.out.printf("Name : %-20s\n", s2.getName());
//		System.out.printf("School : %-20s\n", s2.getSchool());
//		System.out.printf("Grade : %-20s", s2.getGrade());
		s2.print();
	}
}

class Student {

	private String name;
	private String school;;
	private int grade;
	
	public Student(String name, String school, int grade) {
		this.name = name;
		this.school = school;
		this.grade = grade;
	}

	public void print() {
		System.out.println("Name : " + name);
		System.out.println("School : " + school);
		System.out.println("Grade : " + grade);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}



}
