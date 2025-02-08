package wk03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheSpread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int max = 20;
        int points;
        int averageSpread;
        int spreadLimit;

        int point = (Math.abs(rand.nextInt()) % 20 + 1);
        int secret = (Math.abs(rand.nextInt()) % 20 + 1);

        if (secret == point) {
            System.out.println("Need to generate a new secret number.");
            secret = (Math.abs(rand.nextInt()) % 20 + 1);
            if (secret == point) {
                System.out.println("I'm bad at random number generation. I give up.");
                System.exit(0);
            }
        }

        int spread = Math.abs(point - secret);

        System.out.println("The point is " + point);

        if ((max - point) > point) {
            spreadLimit = max - point;
            System.out.println("The maximum spread is " + spreadLimit);
            averageSpread = ((max - point) / 2);
            System.out.println("The average spread is " + averageSpread);
        } else {
            spreadLimit = point;
            System.out.println("The maximum spread is " + spreadLimit);
            averageSpread = (point / 2);
            System.out.println("The average spread is " + averageSpread);
        }

        System.out.println("Guess the spread: ");
        int guess = sc.nextInt();

        if(guess > averageSpread) {
            System.out.println("That's a risky guess; enter a safer guess or just repeat your guess: ");
            guess = sc.nextInt();
        }

        System.out.println("The secret value was " + spread + " for a spread of " + spreadLimit);

        if (guess <= spread) {
            points = spread - (spread - guess);
            System.out.println("You won " + points + " points!");
        } else {
            points = Math.abs(guess - spread);
            System.out.println("You lost " + points + " points!");
        }
    }
}