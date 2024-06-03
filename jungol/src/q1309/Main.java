package q1309;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		long sum = 1;
		for (int i = n; i > 0; i--) {
			sum *= i;
			if (i == 1) {
				System.out.println("1! = 1");
			} else {
				System.out.println(i + "! = " + i + " * " + (i - 1) + "!");
			}
		}
		System.out.println(sum);
	}
}
