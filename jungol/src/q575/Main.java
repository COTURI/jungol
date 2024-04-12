package q575;

import java.util.Scanner;

public class Main {
	public int mpow(int p1, int p2) {
		int res = 1;

		for (int i = 0; i < p2; i++) {
			res *= p1;
		}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		Main main = new Main();
		int ret = main.mpow(n1, n2);
		System.out.println(ret);
	}
}
