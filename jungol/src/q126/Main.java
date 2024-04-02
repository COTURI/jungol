package q126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int odd = 0;
		int even = 0;
		for (;;) {
			int a = sc.nextInt();
			if (a == 0) {
				sc.close();
				break;

			} else if (a % 2 == 1) {
				odd++;

			} else if (a % 2 == 0)
				even++;
		}

		System.out.println("odd : " + odd);
		System.out.println("even : " + even);

	}

}
