package wk10;

import java.util.Random;

public class MethodsCallingMethods {
    public static void main(String[] args) {
        System.out.println("Entering main");

        String quuxOutput = quux(0.5, 2.22);
        System.out.println("The String quux returned is " + quuxOutput);

        System.out.println("Exiting main");
    }

    public static String quux(double a, double b) {
        String secretMessage = "secret message";

        System.out.println("\tEntering quux");
        System.out.println("\tFirst double parameter value is " + a);
        System.out.println("\tSecond double parameter value is " + b);

        double barOutput = bar(6);
        System.out.println("\tReceived " + barOutput + " as a return value");

        System.out.println("\tReturning the String \"" + secretMessage + "\"");

        System.out.println("\tExiting quux");

        return secretMessage;
    }

    public static double bar(int a) {
        System.out.println("\t\tEntering bar");

        System.out.println("\t\tint parameter value is " + a);

        int fooOutput = foo("I like otters");
        System.out.println("\t\tReceived " + fooOutput + " as a return value");

        double barDouble = 4.5;
        System.out.println("\t\tReturning double of " + barDouble);

        System.out.println("\t\tExiting bar");

        return barDouble;
    }

    public static int foo(String a) {
        Random rand = new Random();

        System.out.println("\t\t\tEntering foo");

        System.out.println("\t\t\tString parameter value is \"" + a + "\"");
        int randNum = (Math.abs(rand.nextInt()) % 10 + 1);
        System.out.println("\t\t\tReturning random int of " + randNum);

        System.out.println("\t\t\tExiting foo");

        return randNum;
    }
}
