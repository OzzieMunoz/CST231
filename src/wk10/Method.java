package wk10;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a starting number: ");
        int start = sc.nextInt();
        int stop;

        do {
            System.out.println("Enter a number larger than " + start + ": ");
            stop = sc.nextInt();
        } while (stop <= start);

        int result = sumRange(start, stop);
        System.out.println("The sum of the range from " + start + " to " + stop + " is " + result);

    }

    public static int sumRange(int start, int stop) {
        int sum = 0;
        for (int i = start; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }
}


//Enter the starting number: -5
//Enter a number larger than -5: 10
//The sum of the range from -5 to 10 is 40