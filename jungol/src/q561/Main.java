package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			int input = sc.nextInt();
			arr[i] = input;
		}

		int min = 10000;
		int max = 0;
		for (int i = 0; i < 10; i++) {
			if (arr[i] < 100 && max < arr[i]) {
				max = arr[i];
			}
			if (arr[i] >= 100 && min > arr[i]) {
				min = arr[i];
			}
		}
		if (min == 10000)
			min = 100;
		if (max == 0)
			max = 100;
		System.out.print(max + " " + min);
	}
}
