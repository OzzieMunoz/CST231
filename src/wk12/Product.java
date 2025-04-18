package wk12;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Product {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int max = 10;
        int [] a = new int[max];
        System.out.print("Enter the filename: ");
        String filename = in.next();
        int size = loadFromFile(a, filename);
        long product  = product(a, size);
        System.out.println("The product is " + product);
    }

    public static int loadFromFile(int[] a, String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        Scanner sc = new Scanner(fr);
        int size = 0;

        while (sc.hasNextInt() && size < a.length) {
            int num = sc.nextInt();

            a[size] = num;
            size++;

            if (num == 0) {
                break;
            }
        }

        return size;
    }

    public static long product(int[] a, int size) {
        long product = 1;

        System.out.println(size + " iterations");

        for (int i = 0; i < size; i++) {
            product *= a[i];
        }

        return product;
    }
}
