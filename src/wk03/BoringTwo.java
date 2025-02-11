package wk03;

/*
 * As with the last homework, write a program that allows the user to enter in
 * two double precision floating point numbers, called first and second. Using
 * math functions, determine the larger of the two numbers and print it. Then
 * use conditional logic to print the larger number, or if the two numbers are
 * equal.
 */
import java.lang.Math;
import java.util.Scanner;

public class BoringTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float a = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float b = scanner.nextFloat();

        if (a > b) {
            System.out.println("The first number, " + a + ", is greater than the second number, " + b);
        } else if (a < b) {
            System.out.println("The second number, " + b + ", is greater than the first number, " + a);
        } else {
            System.out.println("The two numbers are equal - both are " + a);
        }
    }
}