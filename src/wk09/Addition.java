package wk09;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first binary number: ");
        long firstBinary = in.nextLong();
        System.out.print("Enter the second binary number: ");
        long secondBinary = in.nextLong();
        String sum = "";
        int carry = 0;

        int firstSum = 0, secondSum = 0;

        for (int i = 16; i >= 0; i--) {
            long digitSize = 1;
            int convertValue = 1;

            for (int j = 1; j <= i; j++) {
                digitSize *= 10;
                convertValue *= 2;
            }

            firstBinary -= digitSize;
            secondBinary -= digitSize;

            if (firstBinary < 0) {
                firstBinary += digitSize;
            } else {
                firstSum += convertValue;
            }

            if (secondBinary < 0) {
                secondBinary += digitSize;
            } else {
                secondSum += convertValue;
            }
        }

        long sumTotal = firstSum + secondSum;

        if(sumTotal == 0) {
            sum = "0" + sum;
        }

        while (sumTotal >= 1) {
            if (sumTotal % 2 == 1) {
                sum = "1" + sum;
            } else {
                sum = "0" + sum;
            }

            sumTotal /= 2;
        }

        System.out.println("Sum = " + sum);
    }
}
