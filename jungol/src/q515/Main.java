package q515;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.println(a + " * " + b + " = " + (a*b));
		System.out.println(a + " * " + b + " = " + (a/b));
		
//      System.out.printf("%d * %d = %d\n", a, b, a*b);
//		System.out.printf("%d / %d = %d\n", a, b, a/b);		
						
//		int res1 = a * b;
//		int res2 = a / b;
//		System.out.println(a + " * " + b + " = " + res1);
//		System.out.printf(a + " / " + b + " = " + res2);

	}
}
