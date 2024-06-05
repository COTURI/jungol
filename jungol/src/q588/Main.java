package q588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n, n);
		sc.close();
	}
	public static void print(int s,int count) {
		if(count ==0) {
			return;
		}
		System.out.print(s + " ");
		print(s-1, count -1);
	}
}
