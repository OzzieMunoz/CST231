package wk05;

import java.util.Scanner;

public class Quadrants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter Y coordinate: ");
        int y = sc.nextInt();

        while (!(x == 0 && y == 0)) {
            if (x > 0 && y != 0) {
                if (y > 0) {
                    System.out.println("The point (" + x + "," + y + ") is in Quadrant 1");
                } else {
                    System.out.println("The point (" + x + "," + y + ") is in Quadrant 4");
                }
            } else if (x < 0 && y != 0) {
                if (y > 0) {
                    System.out.println("The point (" + x + "," + y + ") is in Quadrant 2");
                } else {
                    System.out.println("The point (" + x + "," + y + ") is in Quadrant 3");
                }
            } else {
                System.out.println("The point (" + x + "," + y + ") is not in a Quadrant");
            }

            System.out.print("Enter X coordinate: ");
            x = sc.nextInt();

            System.out.print("Enter Y coordinate: ");
            y = sc.nextInt();
        }

        System.out.print("Done");
    }
}
