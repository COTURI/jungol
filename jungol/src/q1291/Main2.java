package q1291;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if ((x > 1 && x < 10) && (y > 1 && y < 10)) {
			sc.close();
		} else {
			System.out.println("INPUT ERROR!");
		}
		if (x < y) {
			for (int j = 1; j <= 9; j++) {
				for (int i = x; i <= y; i++) {
				System.out.println();
				}

			}
		} else {
			for (int i = x; i >= y; i--) {

			}
		}

	}

}
