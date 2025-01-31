/*
 * Title: CST231-Lab2B
 * Abstract: This program will ask the user for two floating-point values and print
 * the smaller number, and the cube of both numbers.
 * Author: Ozzie Munoz, Tyler Cook
 * Email: ozmunoz, tycook
 * Estimate: 1 hour
 * Date: 1/31/2024
 */

package wk02;

import java.util.Scanner;

public class ArithMethods2 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double smaller_num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a floating point number: ");
        num1 = scanner.nextDouble();

        System.out.println("Please enter another floating point number: ");
        num2 = scanner.nextDouble();

        smaller_num = num1 < num2 ? num1 : num2;
        System.out.println("The smaller number is: " + smaller_num);

        System.out.println("num1: " + num1 + ", num2: " + num2);

        System.out.println("The cube of " + num1 + " is " + Math.pow(num1, 3));

        System.out.println("The cube of " + num2 + " is " + Math.pow(num2, 3));

        System.out.println(num1 + " ^ " + num2 + " is " + Math.pow(num1, num2));
    }
}
