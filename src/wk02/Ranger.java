/*
 * Title: CST231-Lab2B
 * Abstract: This program will ask the user for a min and a range and print
 * the specific range both numbers create and 10 random numbers in the range
 * Author: Ozzie Munoz, Tyler Cook
 * Email: ozmunoz, tycook
 * Estimate: 1 hour
 * Date: 1/31/2024
 */

package wk02;

import java.util.Scanner;
import java.util.Random;

public class Ranger {
    public static void main(String[] args) {
        int min;
        int range;
        Random rand = new Random();

        // Open scanner
        Scanner scanner = new Scanner(System.in);

        // Ask for the min
        System.out.println("Please enter the minimum for the range: ");
        min = scanner.nextInt();

        // Ask for the range
        System.out.println("Please enter the size of the range: ");
        range = scanner.nextInt();

        // Print the specific range of the given min and range
        System.out.println("The range is from " + min + " to " + (min + range - 1) + ".");

        // Print random number within range x10
        System.out.println("A random number in the range: " + (Math.abs(rand.nextInt()) % range + min));
        System.out.println("A random number in the range: " + (Math.abs(rand.nextInt()) % range + min));
        System.out.println("A random number in the range: " + (Math.abs(rand.nextInt()) % range + min));
        System.out.println("A random number in the range: " + (Math.abs(rand.nextInt()) % range + min));
        System.out.println("A random number in the range: " + (Math.abs(rand.nextInt()) % range + min));
        System.out.println("A random number in the range: " + (Math.abs(rand.nextInt()) % range + min));
        System.out.println("A random number in the range: " + (Math.abs(rand.nextInt()) % range + min));
        System.out.println("A random number in the range: " + (Math.abs(rand.nextInt()) % range + min));
        System.out.println("A random number in the range: " + (Math.abs(rand.nextInt()) % range + min));
        System.out.println("A random number in the range: " + (Math.abs(rand.nextInt()) % range + min));

    }
}
