package wk11;

import java.util.Random;
import java.util.Scanner;

public class WriteMethod {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int max = 10;
        int firstVar = generateRandomNumber(max, rand);
        int secondVar;

        do {
            secondVar = generateRandomNumber(max, rand);
        } while (secondVar == firstVar);

        if (secondVar < firstVar) {
            int temp = secondVar;
            secondVar = firstVar;
            firstVar = temp;
        }

        int attempts = askAddition(firstVar, secondVar, sc);
        System.out.println("It took you " + attempts + " tries to solve the problem");
    }

    public static int generateRandomNumber(int max, Random rand) {
        int randNum = Math.abs(rand.nextInt()) % max + 1;

        return randNum;
    }

    public static int askAddition(int min, int max, Scanner in) {
        int correctAnswer = min + max;
        int attempts = 0;
        int userAnswer;

        do {
            System.out.print(min + " + " + max + " = ");
            userAnswer = in.nextInt();
            attempts++;
        } while (userAnswer != correctAnswer);

        return attempts;
    }
}
