package q534;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char inp = sc.next().charAt(0);
		sc.close();

		String msg = "";
		switch (inp) {
		case 'A':
			msg = "Excellent";
			break;
		case 'B':
			msg = "Good";
			break;
		case 'C':
			msg = "Usually";
			break;
		case 'D':
			msg = "Effort";
			break;
		case 'F':
			msg = "Failure";
			break;
		default:
			msg = "error";
			break;
		}
		System.out.println(msg);
	}
}