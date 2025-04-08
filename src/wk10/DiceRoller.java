/*
package wk10;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numSides, numDice, numRolls, numEachRolls;

        System.out.println("How many sides should the dice have? ");
        numSides = sc.nextInt();

        System.out.println("How many dice should I roll each time? ");
        numDice = sc.nextInt();

        do {
            System.out.println("How many times should I roll? ");
            numRolls = sc.nextInt();
        } while (numRolls < 0);

        getPositiveNumberfromUser();

    }

    public static int rollDie(int a) {
        Random rand = new Random();

        int randNum = (Math.abs(rand.nextInt()) % a + 1);
        return randNum;
    }

    public static int rollDice(int a, int b) {

    }

    public static int getPositiveNumberfromUser(String message, Scanner scanner) {
        int num;

    }
}
*/
