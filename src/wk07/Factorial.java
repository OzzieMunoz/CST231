package wk07;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input, factorial;

        System.out.print("Enter a number to factorial: ");
        input = sc.nextInt();
        factorial = input;

        for (int i = (input - 1); i >= 1; i--) {
            factorial *= i;
        }

        System.out.println("The factorial of " + input + "! is equal to " + factorial);
    }
}
