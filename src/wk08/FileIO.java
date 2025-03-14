package wk08;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/wk08/file.txt");
        Scanner sc = new Scanner(fr);

        int size = sc.nextInt();
        System.out.println(size);

        for (int i = 0; i < size && sc.hasNext(); i++) {
            System.out.println(sc.next());
        }

        fr.close();

        FileWriter fw = new FileWriter("src/wk08/filewriter.txt");
        PrintWriter pw = new PrintWriter(fw);

        pw.println("hello");

        fw.close();
    }
}
