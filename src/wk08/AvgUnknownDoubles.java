package wk08;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AvgUnknownDoubles {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String filename;
        double sum;
        int count;

        do {
            System.out.print("Enter a filename (or S to stop): ");
            filename = sc.next();

            if (filename.equals("S")) {
                return;
            }

            sum = 0.0;
            count = 0;

            FileReader fr = new FileReader("src/wk08/" + filename + ".txt");
            Scanner fs = new Scanner(fr);

            while (fs.hasNext()) {
                sum += fs.nextDouble();
                count++;
            }

            System.out.println("Average of " + count + " number: " + sum / count);

            fr.close();
        } while (! filename.equals("S"));
    }
}
