package q129;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		char anw = '\0';
		do {
			System.out.print("Base = ");
			int b = sc.nextInt();
			System.out.print("Height = ");
			int h = sc.nextInt();
			double Tw = b * h * 0.5;
			System.out.printf("Triangle width = %.1f\n", Tw);
			System.out.print("Continue? ");

			anw = sc.next().charAt(0);
		} while (anw == 'y' || anw == 'Y');
		sc.close();
	}
}

