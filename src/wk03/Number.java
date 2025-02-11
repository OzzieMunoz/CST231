package wk03;

/*
 * Take in three numbers from the user and store in variables named a, b, and c.
 * If the variables all have the same value, print "The numbers are the same",
 * followed by a newline. If the variables are entered in ascending order (that
 * is, each variable's value is greater than the prior variable's value), print
 * "The numbers are in ascending order", followed by a newline. If the variables
 * are entered in ascending order (that is, each variable's value is greater
 * than the prior variable's value), print "The numbers are in descending order",
 * followed by a newline. Otherwise, print "I don't see a pattern here" followed by
 * a newline.
 */
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Please enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("Please enter the third number: ");
        int c = scanner.nextInt();

        if (a == b && a == c) {
            System.out.println("The numbers are the same");
        } else if (a > b && b > c) {
            System.out.println("The numbers are in descending order");
        } else if (a < b && b < c) {
            System.out.println("The numbers are in ascending order");
        } else {
            System.out.println("I don't see a pattern here");
        }
    }
}