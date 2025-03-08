package wk07;

import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int start, stop, count;

        do {
            System.out.print("Enter a starting number (greater than 0): ");
            start = s.nextInt();
        } while (start <= 0);

        do {
            System.out.print("Enter a stopping number (greater than " + start + "): ");
            stop = s.nextInt();
        } while (stop <= start);

        for (int i = start; i <= stop; i++) {
            count = 0;
            System.out.print("Factors for " + i + ": " );

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                    count++;
                }
            }

            System.out.println("\n" + i + " has " + count + " factors\n");
        }
    }
}
