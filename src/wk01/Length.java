package wk01;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the length of a line (whole numbers): ");

        int length = scanner.nextInt();

        System.out.println("The length is " + length);

        int area = length * length;
        System.out.println("With sides of " + length + ", a square would have the area of " + area);

        int volume = length * length * length;
        System.out.println("With sides of " + length + ", a cube would have the volume of " + volume);
    }
}
