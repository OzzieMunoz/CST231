package wk01;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your first name: ");

        String name = scanner.nextLine();

        System.out.println("Hello, " + name);
    }
}
