package wk02;
/*
 * Measure the size of a cuboid (a 3-dimensional shape where all sides are rectangles).
 * You will have the formulas for calculating both the area of a cuboid and its volume.
 * It's OK to look up the formulas to calculate the area and volume, but it is NOT to
 * look up java code to solve the problem.
 */

import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter a height: ");
        double height = scanner.nextDouble();

        System.out.print("Enter a depth: ");
        double depth = scanner.nextDouble();

        System.out.println("The area of the cuboid (width = " + width + ", height = " + height
                + ", depth = " + depth + ") is " + (2 * (width * height + height * depth + width * depth)) + " square units");

        System.out.println("The volume of the cuboid (width = " + width + ", height = " + height
                + ", depth = " + depth + ") is " + (width * height * depth) +  " cubic units");
    }
}

/*Enter a width: 4
Enter a height: 2.5
Enter a depth: 10
The area of the cuboid (width = 4.0, height = 2.5, depth = 10.0) is 150.0 square units
The volume of the cuboid (width = 4.0, height = 2.5, depth = 10.0) is 100.0 cubic units*/
