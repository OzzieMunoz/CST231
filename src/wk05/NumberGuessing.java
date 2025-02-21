package wk05;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int max = 10;
        int guessCount = 1;
        int secret = (Math.abs(rand.nextInt()) % max + 1);

        System.out.println(secret);

        System.out.print("Please guess a number between 1 and " + max + ": ");
        int guess = sc.nextInt();

        while (guess != secret) {
            if (guess > secret) {
                System.out.println("Your guess was too high.");
            } else {
                System.out.println("Your guess was too low.");
            }


            System.out.print("Please guess a number between 1 and " + max + ": ");
            guess = sc.nextInt();
            guessCount++;
        }

        System.out.println("\nThe secret number was " + secret + " and it took " + guessCount + " tries.");
    }
}
