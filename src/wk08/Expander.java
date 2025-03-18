package wk08;

import java.util.*;
import java.io.*;

public class Expander {
    public static void main(String[] args) throws IOException {

        Scanner console = new Scanner(System.in);
        System.out.print("Enter a compressed file name: ");

        String filename = console.next();
        System.out.println();

        // FileReader fr = new FileReader(filename);
        // FileReader fr = new FileReader("src/wk08/expander/expander-basic.cmp");
        FileReader fr = new FileReader("src/wk08/expander/expander-bad-data.cmp");

        Scanner fileScanner = new Scanner(fr);

        while (fileScanner.hasNext()) {
            int amount;
            String symbol;

            if (fileScanner.hasNextInt()) {
                amount = fileScanner.nextInt();
                symbol = fileScanner.next();
                if (amount == 0) {
                    amount = 1;
                    System.out.print("Skipping ");
                }
            } else {
                amount = 1;
                System.out.print("Skipping ");
                symbol = fileScanner.next();
            }

            for (int i = 0; i < amount; i++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

    }
}