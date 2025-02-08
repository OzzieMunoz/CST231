package wk03;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int max = 20;
        int secret = (Math.abs(rand.nextInt()) % 20 + 1);

        System.out.print("Guess a number between 1 and " + max + ": ");
        int guess = sc.nextInt();

        if (guess == secret) {
            System.out.println("Your guess was correct");
        } else if (guess < 1 || guess > max) {
            System.out.println("Your guess was not in the correct range");
        } else if (guess >  secret) {
            System.out.println("Your guess was too high");
        } else {
            System.out.println("Your guess was too low");
        }

        System.out.println("The secret was " + secret);
    }
}

/* Example Runs:
 * Guess a number between 1 and 20: 13
 * Your guess was too low
 * The secret number was 16
 *
 * Guess a number between 1 and 20: 19
 * Your guess was too high
 * The secret number was 18
 *
 * Guess a number between 1 and 20: -1000
 * Your guess was not in the correct range
 * The secret number was 17
 *
 * Guess a number between 1 and 20: 21
 * Your guess was not in the correct range
 * The secret number was 16
 */
