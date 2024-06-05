package q1692;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		
		int[] arr = new int[b.length()];
		
		for (int i = 0; i < b.length(); i++) {
			arr[i] = b.charAt(i) - '0';
			// 아스키코드 문자열 '0'을 빼면 int 정수 값이 나옴

		}
		int result1 = a * arr[2];
		int result2 = a * arr[1];
		int result3 = a * arr[0];

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(a * Integer.parseInt(b));
	}
}
