package q614;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		Student2 s1 = new Student2();
		Student2 s2 = new Student2(school, grade);
		s1.print1();
		s2.print1();
	}

}

class Student2 {
	private String school = "Jejuelementary";
	private int grade = 6;

	public void print1() {
		System.out.println(grade + " grade in " + school + " School");
	}

	public Student2() {

	}

	public Student2(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}

//	public String getSchool() {
//		return school;
//	}
//
//	public void setSchool(String school) {
//		this.school = school;
//	}
//
//	public int getGrade() {
//		return grade;
//	}
//
//	public void setGrade(int grade) {
//		this.grade = grade;
//	}

}
