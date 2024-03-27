package q537;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int sum = 0;
		sc.close();

		if (0 < num && num <= 100) {
			for (int i = 0; i <= num; i++)
				sum += i;
		}

		System.out.println(sum);
	}

}
