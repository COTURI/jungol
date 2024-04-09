package q633;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int N = sc.nextInt();

			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.print("number? ");
			System.out.println();
			if (N < 1 || N > 4) {
				System.out.println("none");
				break;
			}
			switch (N) {
			case 1:
				System.out.println("Seoul");
				System.out.println();
				break;
			case 2:
				System.out.println("Washington");
				System.out.println();
				break;
			case 3:
				System.out.println("Tokyo");
				System.out.println();
				break;
			case 4:
				System.out.println("Beijing");
				System.out.println();
				break;
			}
		}
		sc.close();
	}
}
