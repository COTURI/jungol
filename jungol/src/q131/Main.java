package q131;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		if (a > b) {
			for (int i = b; i <= a; i++) {
				System.out.print(i + " ");
			}
		} else if (b > a) {
			for (int i = a; i <= b; i++) {
				System.out.print(i + " ");
			}
		} else if(b==a) {
			System.out.print(b);
		}
	}
}
