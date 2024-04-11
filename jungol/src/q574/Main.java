package q574;

import java.util.Arrays;
import java.util.Scanner;

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[3];
//
//		for (int i = 0; i < arr.length; i++) {
//			int mMax = sc.nextInt();
//			arr[i] = mMax;
//			System.out.print(arr[i]);
//		}
//		sc.close();
//
//		Arrays.sort(arr);
//		System.out.println(arr.length - 1);
//	}
public class Main {

	public static void Max(int a[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.print(max);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3]; // 들어오는 숫자 개수
		for (int i = 0; i < a.length; i++) {
			int input = sc.nextInt();
			a[i] = input;
		}
		sc.close();
		Max(a);
	}
}
