package wk07;

import java.util.Scanner;

public class ProgrammingPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 10, min = 5, input;

        do {
            System.out.print("Enter a number between " + min + " and " + max + ": ");
            input = sc.nextInt();
        } while (!(input <= max && input >= min));

        for (int i = input; i >= 0; i--) {
            System.out.println(i);
        }
    }
}

/*
Enter a number between 5 and 10: 20
Enter a number between 5 and 10: 4
Enter a number between 5 and 10: 7
        7
        6
        5
        4
        3
        2
        1
        0
        */
