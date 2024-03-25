package q594;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine(); // 스캐너 string 일때는 next(공백이전 글자까지) or nextLine (한줄전체
		sc.close();
		
		System.out.println(a + a);
		
		
	}
}
//		for(int a = 0 ; i<100; i++)
// 		System.out.print(i)