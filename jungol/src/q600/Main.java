package q600;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();

		StringTokenizer st = new StringTokenizer(s);
		int tc = st.countTokens();
		System.out.println(tc);
	}
}
