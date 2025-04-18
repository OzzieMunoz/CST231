package wk12;

public class UsingArrays {
    public static void main(String[] args) {
        int size = 10;
        int[] fives =  new int[size];
        fives[0] = 5;

        for (int i = 1; i < size; i++) {
            fives[i] = fives[i-1] + 5;
        }

        print(fives);
        System.out.println("Reverse!");
        printReverse(fives, 7);
    }

    public static void print(int[] fives) {
        for (int i = 0; i < fives.length; i++) {
            System.out.println("Index " + i + ": " + fives[i]);
        }
    }

    public static void printReverse(int[] fives, int limit) {
        int numIterations = fives.length - limit;
        for (int i = (fives.length - 1); i >= numIterations; i--) {
            System.out.println("Index " + i + ": " + fives[i]);
        }
    }
}
