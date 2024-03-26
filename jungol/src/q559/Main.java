package q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		double[] ct = {85.6,79.5,83.1,80.0,78.2,75.0};

//		double[] ct = new double[6];
//		ct[0] = 85.6;
//		ct[1] = 79.5;
//		ct[2] = 83.1;
//		ct[3] = 80.0;
//		ct[4] = 78.2;
//		ct[5] = 75.0;
		
		sum = ct[a-1] + ct[b-1];
		
		System.out.print(sum);
	}
}
