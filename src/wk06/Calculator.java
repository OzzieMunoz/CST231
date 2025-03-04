package wk06;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String answer;

        do {
            System.out.print("Enter first number: ");
            int firstNumber = sc.nextInt();

            System.out.print("Enter second number: ");
            int secondNumber = sc.nextInt();

            System.out.println("Enter 1 for add\nEnter 2 for subtract\nEnter 3 for multiply" +
                    "\nEnter 4 for divide\nEnter 5 for remainder");
            int input = sc.nextInt();

            if (input == 1) {
                System.out.println("The sum of " + firstNumber + " and " + secondNumber +
                        " is " + (firstNumber + secondNumber));
            } else if (input == 2) {
                System.out.println("The difference of " + firstNumber + " and " + secondNumber +
                        " is " + (firstNumber - secondNumber));
            } else if (input == 3) {
                System.out.println("The product of " + firstNumber + " and " + secondNumber +
                        " is " + (firstNumber * secondNumber));
            } else if (input == 4) {
                System.out.println("The division of " + firstNumber + " and " + secondNumber +
                        " is " + (firstNumber / secondNumber));
            } else if (input == 5) {
                System.out.println("The remainder of " + firstNumber + " and " + secondNumber +
                        " is " + (firstNumber % secondNumber));
            }

            System.out.println("Do you want to do another operation? (yes/no)");
            answer = sc.next();

        } while (answer.equals("yes"));

        System.out.println("Goodbye!");
    }
}
