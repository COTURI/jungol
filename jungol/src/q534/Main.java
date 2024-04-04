package q534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char b = a.charAt(0);
		sc.close();
		
		String msg = "";
		
		if (b == 'A') {
			System.out.print("Excellent");
		} else if (b == 'B') {
			System.out.print("Good");
		} else if (b == 'C') {
			System.out.print("Usually");
		} else if (b == 'D') {
			System.out.print("Effort");
		} else if (b == 'F') {
			System.out.print("Failure");
		} else {
			System.out.print("msg");
		}

	}
}
