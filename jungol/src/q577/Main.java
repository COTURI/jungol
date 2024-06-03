package q577;

import java.util.Scanner;

public class Main {
	static int h = 0;
	static int j = 0;

	public static void cnt(int x, int y) {

		if (x > y) {
			h = x / 2;
			j = y * 2;
		} else if (x < y) {
			h = x * 2;
			j = y / 2;
		}
	}
// 이건 기본자료형
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		cnt(x, y);

		System.out.println(h + " " + j);
	}
}
