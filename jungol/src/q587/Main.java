package q587;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        printName("recursive", n);
    }

    public static void printName(String name, int count) {
        if (count == 0) {
            return;
        }
        System.out.println(name);
        printName(name, count - 1);
    }
}