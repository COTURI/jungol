package q533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char prs = sc.next().charAt(0);
		int age = sc.nextInt();

		sc.close();

		if (prs == 'M' && age < 18) {
			System.out.print("BOY");
		} else if (prs == 'M' && age >= 18) {
			System.out.print("MAN");
		} else if (prs == 'F' && age >= 18) {
			System.out.print("WOMAN");
		} else if (prs == 'F' && age < 18) {
			System.out.print("GIRL");
		}
	}
}