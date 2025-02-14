package wk04;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int max = 20;
        int guess;
        int guessCount = 0;
        int guessLimit = 5;

        System.out.println("You have made " + guessCount + " guesses and have " + guessLimit + " left");
        int secret = (Math.abs(rand.nextInt()) % max + 1);

        while (guessCount < guessLimit) {
            System.out.print("Guess a number between 1 and " + max + ": ");
            guess = sc.nextInt();

            guessCount++;
            System.out.println("You have made " + guessCount + " guesses and have " + (guessLimit - guessCount) + " left");

            if (guess > secret) {
                System.out.println("Your guess was too high\n");
            } else if (guess < secret) {
                System.out.println("Your guess was too low\n");
            } else {
                System.out.println("\nThe secret number was " + secret);
                if (guessCount == 1) {
                    System.out.println("You guessed correctly in " + guessCount + " guess!");
                } else {
                    System.out.println("You guessed correctly in " + guessCount + " guesses!");
                }

                return;
            }
        }

        System.out.println("The secret number was " + secret +
                "\nYou did not guess correctly in " + guessLimit + " guesses!");
    }
}

/*
You have made 0 guesses and have 5 left
Guess a number between 1 and 20: 10
Your guess was too high

You have made 1 guesses and have 4 left
Guess a number between 1 and 20: 5
Your guess was too low

You have made 2 guesses and have 3 left
Guess a number between 1 and 20: 8
Your guess was too high

You have made 3 guesses and have 2 left
Guess a number between 1 and 20: 6
The secret number was 6
You guessed correctly in 4 guesses!
You have made 0 guesses and have 5 left
Guess a number between 1 and 20: 2
Your guess was too low
You have made 1 guesses and have 4 left
Guess a number between 1 and 20: 8
Your guess was too low
You have made 2 guesses and have 3 left
Guess a number between 1 and 20: 12
Your guess was too low
You have made 3 guesses and have 2 left
Guess a number between 1 and 20: 14
Your guess was too low
You have made 4 guesses and have 1 left
Guess a number between 1 and 20: 16
Your guess was too low
The secret number was 17
You did not guess correctly in 5 guesses!
*/
