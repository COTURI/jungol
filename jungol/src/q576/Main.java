package q576;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		String p = sc.next();
		int n2 = sc.nextInt();
		sc.close();

		switch (p) {
		case "+":
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			break;
		case "-":
			System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
			break;
		case "*":
			System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
			break;
		case "/":
			System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
			break;
		default:
			System.out.println(n1 + " " + p + " "+ n2 + " = " + 0);
			break;
		}
	}
}
