package wk05;

import java.util.Scanner;

public class Older {
    public static void main(String[] args) {
        int child1, child2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the age of child 1: ");
        child1 = sc.nextInt();

        System.out.print("Please enter the age of child 2: ");
        child2 = sc.nextInt();

        if (child1 > child2) {
            System.out.println("The first child is older");
        } else {
            System.out.println("The second child is older");
        }
    }
}

/*
Please enter the age of child 1: 15
Please enter the age of child 2: 9
The first child is older
Please enter the age of child 1: 1
Please enter the age of child 2: 4
The second child is older*/
