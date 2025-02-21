package wk04;

import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        while (number < 1) {
            System.out.print("Enter a positive number: ");
            number = sc.nextInt();
        }

        while (number > 0) {
            System.out.println(number);
            number--;
        }

        System.out.println("CONTACT!");
    }
}

/*
Enter a positive number: -5
Enter a positive number: 0
Enter a positive number: 8
        8
        7
        6
        5
        4
        3
        2
        1
CONTACT!

Enter a positive number: 1
        1
CONTACT!*/
