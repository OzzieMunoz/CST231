package wk04;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 1;

        System.out.print("Please enter an even number: ");
        int input = sc.nextInt();

        while (input % 2 != 0) {
            System.out.print("Please enter an even number: ");
            input = sc.nextInt();

            count++;
        }

        System.out.println(input + " is an even number");

        if (count == 1) {
            System.out.println("It took you " + count + " try!");
        } else {
            System.out.println("It took you " + count + " tries!");
        }
    }
}

/*
Please enter an even number: 3
Please enter an even number: 5
Please enter an even number: 17
Please enter an even number: 2
        2 is an even number
It took you 4 tries!
Please enter an even number: -5
Please enter an even number: -4
        -4 is an even number
It took you 2 tries!
Please enter an even number: 0
        0 is an even number
It took you 1 try!
*/
