package q128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		for (;;) {
			int N = sc.nextInt();
			if (N % 5 != 0 && N % 3 != 0) {
				cnt++;
			} else if (N == 0) {
				break;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
