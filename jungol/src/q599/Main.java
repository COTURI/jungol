package q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		A = A.toUpperCase();
		String B = A.replaceAll("[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9]", "");
		String C = B.replaceAll("[0-9]", "");
		sc.close();

		System.out.println(C);

	}

}
