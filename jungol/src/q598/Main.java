package q598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char inp = '\0'; // char null로 초기화 시키는 방법

		for (;;) {
			inp = sc.next().charAt(0);
			
			if (Character.isAlphabetic(inp)) {
				System.out.print(inp);
			} else if (Character.isDigit(inp)) {
				System.out.print((int) inp);
			} else {
				break;
			}

//		for (;;) {
//			inp = sc.next().charAt(0);
////			System.out.print(inp);
//
//			if ('a' <= inp && inp <= 'z' || 'A' <= inp && inp <= 'Z') { // 알파벳
//				System.out.println(inp);
//			} else if ('0' <= inp && inp <= '9') { // 숫자
//				System.out.println((int) inp);
//			} else {
//				break;
//			}

			
		}
		sc.close();
	}
}