package wk03;
/*
 * In this problem you will need to accept input for two floating point numbers and
 * using math functions determine which of the numbers is larger.
 * following that you will print the numbers as well as bool stating if it was the higher number
 */

import java.util.Scanner;
import java.lang.Float;

public class TheMostBoringGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float first = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float second = scanner.nextFloat();

        float bigger = (Float.compare(first, second) >= 0) ? first : second;

        System.out.println("The bigger number is " + bigger);
        System.out.println("Is " + first + " the bigger number? " + (Float.compare(first, second) >= 0));
        System.out.println("Is " + second + " the bigger number? " + (Float.compare(second, first) > 0));
    }
}



/*
Enter the first number: 15
Enter the second number: 5
The bigger number is 15.0
Is 15.0 the bigger number? true
Is 5.0 the bigger number? false*/
