package q529;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int h = sc.nextInt();
		int b = h + 100 - m;
		sc.close();

		if (b > 0) {
			System.out.println(b);
			System.out.println("Obesity");
		} else {
			System.out.println(b);
		}
	}
}
