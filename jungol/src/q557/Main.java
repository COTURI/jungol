package q557;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] charr = new char[10]; // charr라는 변수 
		
		for (int i = 0; i < charr.length; i++) {
			charr[i] = sc.next().charAt(0);
		}
		sc.close();
		
		System.out.print(charr[0] +" "+ charr[3] + " " + charr[6]);
		
//		System.out.print(charr[0] + " ");
//		System.out.print(charr[3] + " ");
//		System.out.print(charr[6]);
	}
}
