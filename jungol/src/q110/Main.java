package q110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		double yard = sc.nextDouble();
		double cm = yard*91.44;
		sc.close();
		System.out.print("yard? ");
		System.out.printf("%.1fyard = %.1fcm",yard , cm);

	}

}
