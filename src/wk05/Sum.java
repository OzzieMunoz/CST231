package wk05;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                evenSum = evenSum + i;
            }
            if (i % 2 == 1) {
                oddSum = oddSum + i;
            }
        }

        System.out.println("The sum of all even numbers between 0 and " + number + " is " + evenSum);
        System.out.println("The sum of all odd numbers between 0 and " + number + " is " + oddSum);
    }
}
