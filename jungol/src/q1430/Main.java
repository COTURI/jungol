package q1430;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int anw = a * b * c;

		String str1 = Integer.toString(anw);

		int[] arr = new int[10];

		for (char s : str1.toCharArray()) {
			arr[s - '0']++;
		}
		for(int i = 0; i<10; i++) {
			System.out.println(arr[i]);
		}
	}
}
