package q618;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] per = new Person[5];
		for (int i = 0; i < per.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();
			per[i] = new Person(name, height, weight);
		}
		sc.close();
		Arrays.sort(per);
		System.out.println("name");
		for (int i = 0; i < per.length; i++) {
			System.out.println(per[i]);
		}
		Arrays.sort(per, new Weight());
		System.out.println("weight");
		for (int i = 4; i >= 0; --i) {
			System.out.println(per[i]);
		}

	}

	static class Person implements Comparable<Person> {
		private String name;
		private int height;
		private double weight;

		public String toString() {
			return name + " " + height + " " + weight;

		}

		public Person(String name, int height, double weight) {
			this.name = name;
			this.height = height;
			this.weight = weight;
		}

		public int compareTo(Person otherPerson) {
			return this.name.compareTo(otherPerson.name);
		}
	}

	static class Weight implements Comparator<Person> {
		public int compare(Person person1, Person person2) {
			return Double.compare(person1.weight, person2.weight);
		}
	}

}
