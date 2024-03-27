package q537;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int i = 1;
		int sum = 0;
		num = sc.nextInt();
		sc.close();

		do {
			sum += i;
			i++;
		} while (i <= num);

		System.out.println(sum);
	}
}
