package wk05;

import java.util.Scanner;

public class LoopFlowcharts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the maximum number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (Math.pow(i, 2) < n) {
                System.out.print(Math.pow(i, 2) + " ");
            }
        }
    }
}

/*
Enter the maximum number: 4
        0 1
Enter the maximum number: 100
        0 1 4 9 16 25 36 49 64 81
Enter the maximum number: 0
Enter the maximum number: 1000
        0 1 4 9 16 25 36 49 64 81 100 121 144 169 196 225 256 289 324 361 400 441 484 529
        576 625 676 729 784 841 900 961*/
