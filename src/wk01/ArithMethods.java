/*
 * CST231-Lab1A
 * Ozzie Munoz, Jonathan Gastelum
 * ozmunoz, jgastelum
 * 1/24/2024
 */

package wk01;

import java.util.Scanner;

public class ArithMethods {
    public static void main(String [] args) {
        double number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a floating point number:");
        number = scanner.nextDouble();

        System.out.println("The absolute value of " + number + " is " + Math.abs(number));
        System.out.println("The square of " + number + " is " + Math.pow(number, 2));
        System.out.println("The ceil of " + number + " is " + Math.ceil(number));
        System.out.println("The floor of " + number + " is " + Math.floor(number));
        System.out.println("Rounding  " + number + " gives " + Math.round(number));

        double root = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + root);

        double square = Math.pow(root, 2);
        System.out.println("The square of " + root + " is " + square);

        boolean same = (number == square);
        System.out.println(number + " is the same as " + square + "? " + same);

        double down = Math.floor(number);
        double up = Math.ceil(number);
        boolean diff = (down != up);
        System.out.println("The floor of " + number + " is " + down + " and the ceil is " + up + ". Are they different? " + diff);
    }
}
