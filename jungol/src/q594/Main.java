package q594;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(); // 스캐너 string 일때는 next or nextline
		sc.close();

		System.out.print(a + a);
	}
}
