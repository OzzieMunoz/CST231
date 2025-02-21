package wk04;

import java.util.Scanner;

public class NumberFacts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers, one at a time, and I'll tell you some facts about it. Enter 0 to stop.");

        System.out.print("Enter your first number: ");
        int number = sc.nextInt();

        while (number != 0) {
            System.out.println("You entered " + number);

            if (number % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }

            if (number > 0) {
                System.out.println( "The number is positive");
            } else {
                System.out.println( "The number is negative");
            }

            if (number % 5 == 0) {
                System.out.println("The number is a multiple of 5");
            } else {
                System.out.println("The number is not a multiple of 5");
            }

            System.out.println("The square root of the number is " + Math.sqrt(number));

            System.out.println("The floor of the square root of the number is " + Math.floor(Math.sqrt(number)));

            if (Math.sqrt(number) % 1 == 0) {
                System.out.println("The number is a perfect square");
            } else {
                System.out.println("The number is a not perfect square");
            }

            System.out.print("\nEnter your next number: ");
            number = sc.nextInt();
        }

        System.out.println("Done!");
    }
}

/*
Enter numbers, one at a time, and I'll tell you some facts about it. Enter 0 to
stop.
Enter your first number: 25
You entered 25
The number is odd
The number is positive
The number is a multiple of 5
The square root of the number is 5
The floor of the square root of the number is 5.0
The number is a perfect square
Enter your next number: -36
You entered -36
The number is even
The number is negative
The number is not a multiple of 5
The square root of the number is NaN
The floor of the square root of the number is NaN
The number is a not perfect square
Enter your next number: 45
You entered 45
The number is odd
The number is positive
The number is a multiple of 5
The square root of the number is 6.7082
The floor of the square root of the number is 6.0
The number is a not perfect square
Enter your next number: 100
You entered 100
The number is even
The number is positive
The number is a multiple of 5
The square root of the number is 10
The floor of the square root of the number is 10.0
The number is a perfect square
Enter your next number: 0
Done!*/
