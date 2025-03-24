package wk09;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;

        System.out.print("Enter a binary number: ");
        int binNum = sc.nextInt();

        for (int i = 8; i > 0; i--) {
            int digitSize = 1;
            int convertValue = 1;

            for (int j = 1; j <= i; j++) {
                digitSize *= 10;
                convertValue *= 2;
            }

            binNum -= digitSize;

            if (binNum < 0) {
                binNum += digitSize;
            } else {
                ans += convertValue;
            }
        }

        System.out.println(ans);
    }
}
