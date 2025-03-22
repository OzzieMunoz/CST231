package wk09;

import java.util.Scanner;

public class TwoToTheN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the highest power of 2 (must be > 0): ");
        int n = sc.nextInt();

        int answer = 1;

        for (int i = 0; i <= n; i++) {
            System.out.println("2^" + i + " = " + answer);
            answer *= 2;
        }
    }
}
