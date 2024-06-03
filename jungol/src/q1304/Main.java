package q1304;

import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] arr = new int[a][a];
		sc.close();
		int n = 1;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
//				System.out.print(n + " ");
				arr[i][j] = n;
				n++;
			}
//			System.out.println();
		}
		for(int i = 0; i<a; i++) {
			for(int j = 0; j<a; j++) {
				System.out.print(arr[j][i] + " ");		
			}
			System.out.println();
		}
	}
}
