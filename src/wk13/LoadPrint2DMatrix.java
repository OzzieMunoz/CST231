package wk13;
/*
 * Perform matrix addition, multiplication, and pretty-printing
 *
 */
import java.util.*;

public class LoadPrint2DMatrix {

    static final int SIZE = 3;
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int [][] d = load(s);
        int [][] e = load(s);
        int [][] result;

        String operation, printType;
        do {
            System.out.print("Select operation (a for add, m for multiply, p for print): ");
            operation = s.next();
        } while(! (operation.equals("a") || operation.equals("m") || operation.equals("p")));

        if(operation.equals("p")) {
            print(d);
            print(e);
            return;
        }

        do {
            System.out.print("Select print type (r for result, p for pretty-print): ");
            printType = s.next();
        } while(! (printType.equals("r") || printType.equals("p")));

        if(operation.equals("a")) {
            result = add(d, e);
        } else {
            result = multiply(d, e);
        }

        if(printType.equals("r")) {
            print(result);
        } else {
            if(operation.equals("a")) {
                prettyPrint("+", d, e, result);
            } else {
                prettyPrint("*", d, e, result);
            }
        }
    }

    public static int[][] load(Scanner s) {
        System.out.print("Enter 9 ints for the matrix: ");
        int[][] matrix = new int[SIZE][SIZE];

        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                matrix[r][c] = s.nextInt();
            }
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        System.out.println();

        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] add(int[][] a, int[][] b) {
        int[][] sum = new int[SIZE][SIZE];

        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                sum[r][c] = a[r][c] + b[r][c];
            }
        }
        return sum;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] product = new int[SIZE][SIZE];

        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                int total = 0;
                for (int k = 0; k < SIZE; k++) {
                    total += a[r][k] * b[k][c];
                }
                product[r][c] = total;
            }
        }
        return product;
    }

    public static void prettyPrint(String operator, int[][] a, int[][] b, int[][] result) {
        System.out.println();

        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                System.out.print(a[r][c] + " ");
            }
            if (r == 1) {
                System.out.print(" " + operator + " ");
            } else {
                System.out.print("   ");
            }
            for (int c = 0; c < SIZE; c++) {
                System.out.print(b[r][c] + " ");
            }
            if (r == 1) {
                System.out.print(" = ");
            } else {
                System.out.print("   ");
            }
            for (int c = 0; c < SIZE; c++) {
                System.out.print(result[r][c] + " ");
            }
            System.out.println();
        }
    }
}
