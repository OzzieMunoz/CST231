package wk08;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) throws IOException {
System.out.println("exercise 1\n");

        FileReader fr = new FileReader("src/wk08/file.txt");
        Scanner sc = new Scanner(fr);

        int num = sc.nextInt();
        System.out.println(num);

        int lineNumber = 0;

        while (sc.hasNextLine()) {
            String line = sc.next();
            lineNumber++;

            if (lineNumber % 2 == 0) {
                System.out.println(line);
            }
        }

System.out.println("\nexercise 2\n");

        fr.close();

        fr = new FileReader("src/wk08/file2.txt");
        sc = new Scanner(fr);

        num = sc.nextInt();
        System.out.println(num);

        int wordCount = 1;
        String prevLine = sc.next();
        lineNumber = 0;

        while (sc.hasNextLine()) {
            String line = sc.next();

            if (prevLine.equals(line)) {
                wordCount++;
            } else {
                System.out.println(prevLine + ": " + wordCount);
                wordCount = 1;
            }
            prevLine = line;
            lineNumber++;
        }
        System.out.println(prevLine + ": " + wordCount + "\n");

        fr.close();

System.out.println("\nexercise 3 (WIP)\n");

        fr = new FileReader("src/wk08/file3.txt");
        sc = new Scanner(fr);

        num = sc.nextInt();
        System.out.println(num);

        for(int i = 0; i < num; i++) {
            String word = sc.next();
            System.out.println(word);

            for (int j = 0; j < num; j++) {
                System.out.println(" " + sc.next());
            }
        }

        fr.close();
    }
}
