package wk07;

import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random(0);

        double total = 0.0;

        System.out.print("How many dice (1 to many): ");
        int numDice = sc.nextInt();

        System.out.print("How many rolls (1 to many): ");
        int numRolls = sc.nextInt();

        System.out.print("Print every X rolls (1 to many): ");
        int xRolls = sc.nextInt();

        for (int i = 1; i <= numRolls; i++) {
            double diceTotal = 0.0;

            for (int j = 1; j <= numDice; j++) {
                int roll = (Math.abs(rand.nextInt()) % 6 + 1);
                diceTotal += roll;
                if (i % xRolls == 0) {
                    System.out.print("Die " + j + ": " + roll + "  ");
                }
            }

            if (i % xRolls == 0) {
                System.out.println("Roll " + i + ": " + ((int) diceTotal));
            }
            total += diceTotal;
        }

        double rollAvg = total/numRolls;
        double dieAvg = total/(numDice * numRolls);

        System.out.println("Sum of " + numRolls + " rolls of " + numDice + " dice: " + ((int) total));
        System.out.println("for an average of " + rollAvg + " per roll");
        System.out.println("for an average of " + dieAvg + " per die");
    }
}
