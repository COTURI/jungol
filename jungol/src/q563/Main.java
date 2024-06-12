package q563;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			int n = sc.nextInt();
			arr[i] = n;
		}
		sc.close();
		Arrays.sort(arr);
		for (int j = 10; j > 0; j--) {
			System.out.print(arr[j-1] + " ");
		}
	}
}
