package q125;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		sc.close();

		// for문
		for (int i = 1; i <= a; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// while문
		int h = 1;
		while (h <= a) {
			System.out.print(h++ + " ");
		}
		System.out.println();
		
		// do while 문
		int k = 1;
		do {
			System.out.print(k + " ");
		} while (k++ < a);

	}
}
