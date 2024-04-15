package q535;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		sc.close();
		
		switch((int)N) {
		case 4 : 
			System.out.println("scholarship");
			break;
		case 3 : 
			System.out.println("next semester");
			break;
		case 2 : 
			System.out.println("seasonal semester");
			break;
		default:
			System.out.println("retake");
			break;
		}		
	}
}
