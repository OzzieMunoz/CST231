package wk12;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CheckForRepeats {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String filename = sc.next();

        int[] data = loadFromFile(filename);
        if (hasRepeats(data) == true) {
            System.out.println(filename + " has repeats");
        } else {
            System.out.println(filename + " has NO repeats");
        }

        sc.close();
    }

    public static int[] loadFromFile(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        Scanner inFile = new Scanner(fr);

        int count = inFile.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = inFile.nextInt();
        }

        inFile.close();
        fr.close();

        return arr;
    }

    public static boolean hasRepeats (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
