package wk07;

import java.util.Scanner;

public class Summoner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, count = 0, sum = 0;
        String answer;

        do {
            System.out.print("What number should I count up to (1 or higher)? ");
            number = sc.nextInt();
        } while (number <= 0);

        for (int i = 0; i <= number; i++) {
            do {
                System.out.print("Should I add the number " + i + " to the sum? (y/n) ");
                answer = sc.next();

                if (answer.equals("y")) {
                    sum += i;
                    count++;
                }
            } while (! answer.equals("y") && ! answer.equals("n"));
        }

        System.out.println("You added " + count + " numbers for a sum of " + sum);
        System.out.println("Done");
    }
}
