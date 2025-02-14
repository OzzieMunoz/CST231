package wk04;
import java.util.Random;
import java.util.Scanner;
/************************************************************
 * CST231 Lab 04 B Starting Code
 * This program generates a random password that the user
 * has to enter correctly. You should first ensure that the
 * number of required characters is at least five, then
 * let the user enter the password over and over until they get it
 * perfectly correct
 * Author: Joshua B. Gross
 * Date:
 ************************************************************/
public class PasswordEntry {
    public static void main(String[] args) {
        // below, loop until the user enters a size of at least 5
        Scanner s = new Scanner(System.in);

        int count = 1;

        System.out.print("Enter the password size (between 5 and 10): ");
        int size = s.nextInt();
        // leave this line alone

        String password = generatePassword(size);
        // below, loop until the user enters the password correctly

        System.out.print("The password is \"" + password + "\"; enter it perfectly: ");
        String guess = s.next();

        while (!guess.equals(password)) {
            System.out.print("The password is \"" + password + "\"; enter it perfectly: ");
            guess = s.next();

            count++;
        }

        if (count == 1) {
            System.out.println("You correctly entered the password after " + count + " try!");
        } else {
            System.out.println("You correctly entered the password after " + count + " tries!");
        }
    }

    public static String generatePassword(int length) {

        Random r = new Random();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < length; i++) {
            sb.append((char)(r.nextInt(75) + 48));
        }

        return sb.toString();
    }
}
