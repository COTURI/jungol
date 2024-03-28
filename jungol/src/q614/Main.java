package q614;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student("Jejuelementary", 6);
		s1.print1();

		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();

		Student s2 = new Student(school, grade);
		s2.print2();
	}

}

class Student {
	private String school;
	private int grade;

	public void print1() {
		System.out.println(grade + " grade in " + school + " School");
	}

	public Student(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}

	public void print2() {
		System.out.println(grade + " grade in " + school + " School");
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