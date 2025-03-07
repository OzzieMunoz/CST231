package wk07;

import java.util.Scanner;

public class HollowQuad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height: ");
        int height = sc.nextInt();

        System.out.print("Enter the width: ");
        int width = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height) {
                    System.out.print("*  ");
                } else if (j == 1 || j == width) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
