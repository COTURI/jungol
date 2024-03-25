package q555;

import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		char[] charr = new char[10]; // 10개짜리 문자를 저장할수 있는 배열 선언
		for (int i = 0; i < charr.length; i++) {
			charr[i] = sc.next().charAt(0); // 맨앞에 데이터 값을 뽑는다
		}
		sc.close();
		for (int i = 0; i < charr.length; i++) {
			System.out.print(charr[i]);
		}
	}
}
