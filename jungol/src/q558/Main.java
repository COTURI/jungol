package q558;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100];
		int a = 0;

		while (true) {
			num[a] = sc.nextInt();
			if (num[a] == 0) {
				break;
			}
			a++;
		}
		for (int i = a-1 ; i >= 0; i--)
			System.out.print(num[i] + " ");
		sc.close();
	}
}