package wk10;

import java.util.Scanner;

public class NumberChecker {
    public static int getPositiveNumber(String output, Scanner in) {
        int num;

        do {
            System.out.print(output);
            num = in.nextInt();
        } while (num <= 0);

        return num;
    }

    public static int getNumberAbove(int minimum, Scanner in){
        int num;

        do {
            System.out.print("Enter a number above " + minimum + ": ");
            num = in.nextInt();
        } while (num <= minimum);

        return num;
    }

    public static int getNumberInRange(int minimum, int maximum, Scanner in){
        int num;

        do {
            System.out.print("Enter a number between " + minimum + " and " + maximum + ": ");
            num = in.nextInt();
        } while (num < minimum || num > maximum);
        
        return num;
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = getPositiveNumber("Enter the count of numbers to check: ", s);
        System.out.print("Enter a minimum number for the range: ");

        int minimum = s.nextInt();

        int maximum = getNumberAbove(minimum, s);
        int nextNumber;

        do {
            nextNumber = getNumberInRange(minimum, maximum, s);
            System.out.println("Is " + nextNumber + " even? " + isEven(nextNumber));
            count--;
        } while(count > 0);
    }

}
