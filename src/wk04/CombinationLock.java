package wk04;

import java.util.Scanner;

public class CombinationLock {
    public static void main(String[] args) {
        int firstSecret = 36;
        int secondSecret = 22;
        int thirdSecret = 45;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstSecret == firstNumber) {
            counter++;
        }
        if (secondSecret == secondNumber) {
            counter++;
        }
        if (thirdSecret == thirdNumber) {
            counter++;
        }

        if (counter == 0) {
            System.out.println("You got zero correct");
        } else if (counter == 1) {
            System.out.println("You got one right");
        } else if (counter == 2) {
            System.out.println("You got two correct");
        } else {
            System.out.println("Lock opened");
        }

        System.out.println("Secret Numbers: " + firstSecret + " " + secondSecret + " " + thirdSecret);
    }
}

/*
Enter the first number: 36
Enter the second number: 22
Enter the third number: 45
Lock opened
Secret Numbers: 36 22 45

Enter the first number: 36
Enter the second number: 21
Enter the third number: 45
You got two correct
Secret Numbers: 36 22 45

Enter the first number: 5
Enter the second number: 22
Enter the third number: 45
You got two correct
Secret Numbers: 36 22 45

Enter the first number: 36
Enter the second number: 44
Enter the third number: 1
You got one right
Secret Numbers: 36 22 45

Enter the first number: 1
Enter the second number: 2
Enter the third number: 3
You got zero correct
Secret Numbers: 36 22 45
*/
