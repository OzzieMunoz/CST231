package wk05;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int max = sc.nextInt();

        for (int i = 1; i < 5; i++) {
            System.out.print("Enter a whole number: ");
            int n = sc.nextInt();

            if (n > max) {
                max = n;
            }
        }

        System.out.println("The largest number entered was " + max);
        System.out.println("Done");
    }
}
