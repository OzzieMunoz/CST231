package wk06;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        int studentCount, math, phys, chem, bio, eng, studentSum, classSum = 0;
        double studentPercent, classPercent;

        Scanner sc = new Scanner(System.in);

        System.out.print("How many students are in the class? ");
        studentCount = sc.nextInt();

        for (int i = 0; i < studentCount; i++) {
            studentSum = 0;
            System.out.println("Enter grades for student " + (i + 1));

            System.out.print("Enter grade for Math: ");
            math = sc.nextInt();
            studentSum += math;
            System.out.print("Enter grade for Physics: ");
            phys = sc.nextInt();
            studentSum += phys;
            System.out.print("Enter grade for Chemistry: ");
            chem = sc.nextInt();
            studentSum += chem;
            System.out.print("Enter grade for Biology: ");
            bio = sc.nextInt();
            studentSum += bio;
            System.out.print("Enter grade for English: ");
            eng = sc.nextInt();
            studentSum += eng;

            studentPercent = studentSum / 5.0;

            System.out.println("Your percentage is: " + Math.round(studentPercent) + "%");

            if (studentPercent >= 90) {
                System.out.println("Your grade is A.");
            } else if (studentPercent >= 80) {
                System.out.println("Your grade is B.");
            } else if (studentPercent >= 70) {
                System.out.println("Your grade is C.");
            } else if (studentPercent >= 60) {
                System.out.println("Your grade is D.");
            } else {
                System.out.println("Your grade is F.");
            }

            classSum += studentPercent;
        }

        if (studentCount == 0) {
            classPercent = 0;
        } else {
            classPercent = classSum / studentCount;
        }

        System.out.println("The average student grade is " + Math.round(classPercent) + "%");
        System.out.print("Grading complete!");
    }
}
