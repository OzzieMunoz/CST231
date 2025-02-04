package wk01;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a temperature: ");

        double inputTemp = scanner.nextDouble();

        double celsiusTemp = (inputTemp - 32) / 1.8;

        double fahrenheitTemp = (inputTemp * 9 / 5) + 32;

        System.out.println("If the Fahrenheit temperature is " + inputTemp +
                ", the Celsius temperature is " + celsiusTemp);
        System.out.println("If the Celsius temperature is " + inputTemp +
                ", the Fahrenheit temperature is " + fahrenheitTemp);
    }
}
