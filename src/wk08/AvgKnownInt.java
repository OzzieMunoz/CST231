package wk08;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AvgKnownInt {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String filename;
        double sum;
        int size;

        do {
            System.out.print("Enter a filename (or S to stop): ");
            filename = sc.next();

            if (filename.equals("S")) {
                return;
            }

            sum = 0.0;

            FileReader fr = new FileReader("src/wk08/" + filename + ".txt");
            Scanner fs = new Scanner(fr);

            size = fs.nextInt();
            System.out.println(size);

            for (int i = 0; i < size; i++) {
                sum += fs.nextInt();
            }

            if (size == 0.0) {
                System.out.println("Average of 0 numbers: 0.0");
            } else {
                System.out.println("Average of " + size + " numbers: " + sum / size);
            }

            fr.close();
        } while (! filename.equals("S"));
    }
}
