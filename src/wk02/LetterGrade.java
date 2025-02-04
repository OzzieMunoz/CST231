package wk02;

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your grade (0-100): ");
        int grade = sc.nextInt();

        if(grade >=90 && grade <=100) {
            System.out.println("Your grade is an A");
        }
        else if(grade >=80 && grade <=90) {
            System.out.println("Your grade is a B");
        }
        else if(grade >=70 && grade <=80) {
            System.out.println("Your grade is a C");
        }
        else if(grade >=60 && grade <=70) {
            System.out.println("Your grade is a D");
        }
        else if(grade >=0 && grade <=60) {
            System.out.println("Your grade is a F");
        }
        else {
            System.out.println(grade + " is not valid.");
        }
    }
}

/*
Please enter your grade (0-100): 75
Your grade is a C
*/
