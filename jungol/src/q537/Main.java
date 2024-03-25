package q537;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0;
		int sum = 0;
		sc.close();
		if( 0 < num && num <= 100) {
			while( i <= num ){
				sum += i;
				i++;
			}
			System.out.println(sum);
		}
		
	}

}
