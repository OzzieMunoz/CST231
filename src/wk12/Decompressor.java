package wk12;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Decompressor {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String filename;
        do {
            System.out.print("Enter the name of a compressed file (.cmp extension): ");
            filename = in.next();
        } while(! filename.endsWith(".cmp"));

        FileReader fr = new FileReader(filename);
        Scanner inFile = new Scanner(fr);
        int lines = inFile.nextInt();
        for(int i = 0; i < lines; i++) {
            printLine(inFile);
        }

        fr.close();
    }

    public static char switchChar(char c) {
        if (c == ' ') {
            return 'x';
        } else {
            return ' ';
        }
    }

    public static void printBlock(int size, char c) {
        for (int i = 0; i < size; i++) {
            System.out.print(c);
        }
    }

    public static void printLine(Scanner inFile) {
        int blockCount, blockSize;
        char c = ' ';

        blockCount = inFile.nextInt();

        for (int i = 0; i < blockCount; i++) {
            blockSize = inFile.nextInt();
            printBlock(blockSize, c);
            c = switchChar(c);
        }

        System.out.println();
    }
}
