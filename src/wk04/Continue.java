package wk04;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        int counter = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Continue? (y/n) ");
        String input = scanner.nextLine();

        while (input.equalsIgnoreCase("y")) {
            System.out.print("Continue? (y/n) ");
            input = scanner.nextLine();
            counter++;
        }

        System.out.println("The loop repeated " + counter + " times.");
    }
}

/*
Continue? (y/n) Y
Continue? (y/n) y
Continue? (y/n) Y
Continue? (y/n) Y
Continue? (y/n) n
The loop repeated 5 times.
Continue? (y/n) y
Continue? (y/n) yes
The loop repeated 2 times.
*/
