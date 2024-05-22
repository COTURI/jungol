package q1303;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int n = 1;
		for (int j = 1; j <= a; j++) {
			for (int i = 1; i <= b; i++) {
				System.out.print(n + " ");
				n++;
			}
			System.out.println();
		}
	}
}
