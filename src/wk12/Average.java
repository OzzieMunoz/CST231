package wk12;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 10;
        int size = getCount(max, in);
        int [] data = loadArray(size, in);
        double avg = average(data);
        System.out.println("The average is " + avg);
    }

    public static int getCount(int max, Scanner in) {
        int size;

        do {
            System.out.print("How many numbers to average (2-10): ");
            size = in.nextInt();
        } while (size < 2 || size > max);

        return size;
    }

    public static int[] loadArray(int size, Scanner in) {
        int [] data = new int[size];

        System.out.println("Enter " + size + " integers to average");

        for (int i = 0; i < size; i++) {
            System.out.print("\t" + (i + 1) + ": ");
            data[i] = in.nextInt();
        }

        return data;
    }

    public static double average(int[] data) {
        double sum = 0;

        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }

        return sum / data.length;
    }
}
