package q571;

import java.util.Scanner;

public class Main {
	public static void print() {
		System.out.println("~!@#$^&*()_+|");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		
		for (int i = 1; i <= a; i++) {
			print();
		}
	}
}
