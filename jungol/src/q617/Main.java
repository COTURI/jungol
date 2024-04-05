package q617;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] per = new Person[5];
		for (int i = 0; i < per.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();

			per[i] = new Person(name, height);
		}
		sc.close();
		Arrays.sort(per);
		System.out.print(per[0]);
	}

}

class Person implements Comparable<Person> {
	private String name;
	private int height;

	public String toString() {
		return name + " " + height;

	}

	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public int compareTo(Person otherPerson) {

		return Integer.compare(this.height, otherPerson.height);
	}

}
