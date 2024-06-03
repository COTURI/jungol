package q1304;

import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = 1;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j+=a) {
				System.out.print(n + " ");
				n++;
			}
			System.out.println();
			
		}
	}
}
