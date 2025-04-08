package wk10;

public class SimpleMethods {
    public static void main(String[] args) {
        int twoIntSum = addTwoInts(7, 4);
        System.out.println("Two ints: " + twoIntSum);

        int threeIntSum = addThreeInts(7, 4, 9000);
        System.out.println("Three ints: " + threeIntSum);

        double twoDoubleSum = addTwoDoubles(0.4, 7.5);
        System.out.println("Two doubles: " + twoDoubleSum);


        double threeDoubleSum = addThreeDoubles(0.4, 7.5, 0.001);
        System.out.println("Three doubles: " + threeDoubleSum);
    }

    public static int addTwoInts(int a, int b) {
        return a + b;
    }

    public static int addThreeInts(int a, int b, int c) {
        return a + b + c;
    }

    public static double addTwoDoubles(double a, double b) {
        return a + b;
    }

    public static double addThreeDoubles(double a, double b, double c) {
        return a + b + c;
    }
}
