package q133;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        sc.close();
        System.out.printf("%.2f", (double)sum / n);
    }
}