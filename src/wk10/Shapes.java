package wk10;

import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = getSize(in);
        System.out.println("Rectangle:");
        square(size);
        System.out.println();
        System.out.println("Triangle:");
        triangle(size);
        System.out.println();
        System.out.println("Flipped Triangle:");
        flippedTriangle(size);
        System.out.println();
        System.out.println("Parallelogram");
        parallelogram(size);
    }

    public static int getSize(Scanner in) {
        int size;

        do {
            System.out.print("Enter the size: ");
            size = in.nextInt();
        } while (size <= 1);

        return size;
    }

    public static void square(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void flippedTriangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void parallelogram(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
