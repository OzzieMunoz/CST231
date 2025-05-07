package wk13;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * This is the last homework for CST 231, introduced in Spring 2025
 * Students will implement set operations using linear search,
 * covered in the last lab
 */

public class SetOperations {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the name of the file for set A: ");
        String file1 = in.next();
        System.out.println();
        int [] setA = loadArray(file1);

        System.out.println("Contents of set A: ");
        print(setA);

        System.out.print("Enter the name of the file for set B: ");
        String file2 = in.next();
        System.out.println();
        int [] setB = loadArray(file2);

        System.out.println("Contents of set B: ");
        print(setB);

        System.out.println("Are " + file1 + " and " + file2 +" disjoint? " + isDisjoint(setA, setB));

        System.out.println("Is " + file1 + " a subset of " + file2 + "? " + isSubset(setA, setB));
        System.out.println("Is " + file1 + " a proper subset of " + file2 + "? " + isProperSubset(setA, setB));
        System.out.println("Is " + file2 + " a subset of " + file1 + "? " + isSubset(setB, setA));
        System.out.println("Is " + file2 + " a proper subset of " + file1 + "? " + isProperSubset(setB, setA));

    }

    public static int[] loadArray(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        Scanner fs = new Scanner(fr);

        int count = fs.nextInt();
        int[] array = new int[count];

        for (int i = 0; i < count; i++) {
            array[i] = fs.nextInt();
        }

        fs.close();
        return array;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static boolean contains(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void testContains(int[] array) {
        Scanner input = new Scanner(System.in);
        int value;

        do {
            System.out.print("Enter an integer to search for (or 0 to stop): ");
            value = input.nextInt();

            System.out.println("Does the set contain " + value + "? " + contains(array, value));
        } while (value != 0);
    }

    public static boolean isDisjoint(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (contains(b, a[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSubset(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (!contains(b, a[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isProperSubset(int[] a, int[] b) {
        boolean subset = isSubset(a, b);
        boolean longer;

        if (b.length > a.length) {
            longer = true;
        } else {
            longer = false;
        }

        if (subset && longer) {
            return true;
        } else {
            return false;
        }
    }
}