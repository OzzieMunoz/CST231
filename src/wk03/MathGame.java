package wk03;
/*
For this problem you will create a math game following simple rules.
1. Take in three integer numbers and store in variables called a, b, and c
2. If either a or b is zero, print an error message and exit (add the statement return 0; after the error message)
3. Determine if a+b is equal to c
If it is, print out that fact
If not, print what a+b is equal to
4. Determine if a-b OR b-a  is equal to c
(we don't have to check the other way for + because of the commutative property)
If either is equal to c, print out which is true
If not, print what a-b and b-a are equal to
5. Determine if a*b is equal to c
If it is, print out that fact
If not, print what a*b is equal to
6. Determine if a/b  OR  b/a  is equal to c with no remainder
(we don't have to check the other way for * because of the commutative property)
If either is equal to c, print out which is true
If not, print what a/b and b/a are equal to, along with the remainders

*/

import java.util.Scanner;

public class MathGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number a: ");
        int a = scanner.nextInt();

        System.out.print("Please enter number b: ");
        int b = scanner.nextInt();

        System.out.print("Please enter number c: ");
        int c = scanner.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("cannot use zero");
            return;
        }

        if (a + b == c) {
            System.out.println(a + " + " + b + " equals " + c);
        } else {
            System.out.println(a + " + " + b + " does not equal " + c + ", it equals " + (a + b));
        }

        if (a - b == c) {
            System.out.println(a + " - " + b + " equals " + c);
        } else if (b - a == c) {
            System.out.println(b + " - " + a + " equals " + c);
        } else {
            System.out.println(a + " - " + b + " does not equal " + c + ", it equals " + (a - b));
            System.out.println(b + " - " + a + " does not equal " + c + ", it equals " + (b - a));
        }

        if (a * b == c) {
            System.out.println(a + " * " + b + " equals " + c);
        } else {
            System.out.println(a + " * " + b + " does not equal " + c + ", it equals " + (a * b));
        }

        if (a / b == c) {
            System.out.println(a + " / " + b + " equals " + c);
        } else if (b / a == c) {
            System.out.println(b + " / " + a + " equals " + c);
        } else {
            System.out.println(a + " / " + b + " does not equal " + c + ", it equals " + (a / b) + " with a remainder of " + (a % b));
            System.out.println(b + " / " + a + " does not equal " + c + ", it equals " + (b / a) + " with a remainder of " + (b % a));
        }
    }
}