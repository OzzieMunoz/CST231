package wk08;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OpUnknownInt {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a filename: ");
        String filename = console.next();

        FileReader fr = new FileReader(filename);
        Scanner fs = new Scanner(fr);

        int sum = 0;

        while(fs.hasNext()) {
            String operation = fs.next();

            while(fs.hasNextInt()) {
                int value = fs.nextInt();
                
                if(operation.equalsIgnoreCase("add")) {
                    sum += value;
                    System.out.println("Added " + value + " -> Result: " + sum);
                } else {
                    sum -= value;
                    System.out.println("Subtracted " + value + " -> Result: " +
                            sum);
                }
            }
        }
        System.out.println("Final Result: " + sum);
        fr.close();
    }
}
