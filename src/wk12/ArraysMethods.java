package wk12;

import java.util.Scanner;

public class ArraysMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[20];

        System.out.println("Enter up to 5 numbers; use 0 to indicate you are done");
        sum(arr, load(arr, sc));

    }

    public static int load(double[] arr, Scanner sc) {
        double input;
        int count = 0;

        do {
            System.out.print("Enter a floating point number, or 0 to stop: ");
            input = sc.nextDouble();

            if (input == 0) {
                break;
            }

            arr[count] = input;
            count++;
        } while (true);

        return count;
    }

    public static double sum(double[] arr , int count) {
        double sum = 0;

        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }

        System.out.println("The sum of the " + count  + " numbers is " + sum);

        return sum;
    }
}
