package wk08;

import java.io.*;
import java.util.Scanner;

public class Step {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a compressed file name: ");

        String filename = console.next();
        System.out.println();

        // FileReader fr = new FileReader(filename);
        // FileReader fr = new FileReader("src/wk08/steps/step-odd-steps.cmp");
        FileReader fr = new FileReader("src/wk08/steps/step-nosize.cmp");

        Scanner fileScanner = new Scanner(fr);

        int size = 0, count =  fileScanner.nextInt();
        if (fileScanner.hasNext()) {
            if (fileScanner.hasNextInt()) {
                size = fileScanner.nextInt();
            } else {
                size = 2;
                System.out.println("No indent size, defaulting to " + size);
            }
        }

        double middle = Math.ceil(count / 2.0);

        for (int i = 0; i < middle; i++) {
            for (int j = i; j > 0; j--) {
                for (int k = 0; k < size; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println(fileScanner.next());
        }

        for (int i = (count - (int)middle); i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                for (int k = 0; k < size; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println(fileScanner.next());
        }
    }
}
