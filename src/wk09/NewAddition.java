package wk09;

import java.util.Scanner;

public class NewAddition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first binary number: ");
        long firstBinary = in.nextLong();

        System.out.print("Enter the second binary number: ");
        long secondBinary = in.nextLong();

        String sum = "";
        int carry = 0;

       while (firstBinary != 0 || secondBinary != 0) {
           int digitSum = (int)(firstBinary % 10) + (int)(secondBinary % 10) + carry;
           System.out.println((int)(firstBinary) + " % 10 = " + (int)(firstBinary % 10));
           System.out.println((int)(secondBinary) + " % 10 = " + (int)(secondBinary % 10));
           System.out.println("digitSum = " + (int)(firstBinary % 10) + " + " + (int)(secondBinary % 10) + " + " + carry);
           System.out.println("digitSum = " + digitSum + "\n");
           System.out.println("sum = " + digitSum % 2 + " + " + sum);
           sum = (digitSum % 2) + sum;
           System.out.println("sum = " + sum + "\n");
           carry = digitSum / 2;
           System.out.println("carry = " + digitSum + " / 2");
           System.out.println("carry = " + carry + "\n");

           System.out.println("firstBinary = " + firstBinary + " / 10");
           firstBinary = firstBinary / 10;
           System.out.println("firstBinary = " + firstBinary + "\n");
           System.out.println("secondBinary = " + secondBinary + " / 10");
           secondBinary = secondBinary / 10;
           System.out.println("secondBinary = " + secondBinary + "\n");
       }

        if (carry != 0) {
            sum = carry + sum;
        }

        if (sum.isEmpty()) {
            sum = "0";
        }

        System.out.println("Sum = " + sum);
    }
}
