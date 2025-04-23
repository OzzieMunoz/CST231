package wk13;

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class ArrayLoader2D {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String filename = getFileName(sc);

        int[][] data = loadArray(filename);

        System.out.println("Printing data:");
        print(data);
    }

    public static String getFileName(Scanner in) {
        System.out.print("Enter a filename: ");
        return in.nextLine();
    }

    public static int[][] loadArray(String filename) throws FileNotFoundException {
        Scanner fs = new Scanner(new FileReader(filename));
        int rows = fs.nextInt();
        int cols = fs.nextInt();
        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (fs.hasNextInt()) {
                    array[i][j] = fs.nextInt();
                } else {
                    break;
                }
            }
        }

        fs.close();
        return array;
    }

    public static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
