package q596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = sc.nextInt();
		sc.close();

		if (a.length() > b) {
			for (int i = a.length() - 1, cnt = 0; b > cnt; i--, cnt++) {
				// cnt라는 변수를 만들어 그 숫자만큼 저
				System.out.print(a.charAt(i));
			}
		} else {
			for (int i = a.length() - 1; i >= 0; i--) {
				System.out.print(a.charAt(i));
			}

		}
	}
}