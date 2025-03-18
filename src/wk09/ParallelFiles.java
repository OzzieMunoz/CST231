package wk09;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ParallelFiles {
    public static void main(String[] args) throws IOException {
        String namesFile = "src/wk09/names.txt";
        String scoresFile = "src/wk09/scores.txt";

        FileWriter namesFw = new FileWriter(namesFile);
        PrintWriter namesPw = new PrintWriter(namesFw);
        FileWriter scoresFw = new FileWriter(scoresFile);
        PrintWriter scoresPw = new PrintWriter(scoresFw);

        Scanner sc = new Scanner(System.in);
        String name;
        double score;

        do {
            System.out.print("Please enter a name (0 to stop): ");
            name = sc.next();

            if(name.equals("0")) {
                break;
            }
            namesPw.println(name);

            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter a score for " + name + " in course " + i + ": ");
                score = sc.nextDouble();

                scoresPw.println(score);
            }
        } while (!name.equals("0"));

        namesFw.close();
        scoresFw.close();

        System.out.println("Final Report");

        FileReader namesFr = new FileReader(namesFile);
        Scanner namesSc = new Scanner(namesFr);
        FileReader scoresFr = new FileReader(scoresFile);
        Scanner scoresSc = new Scanner(scoresFr);

        while(namesSc.hasNext()) {
            String nameOut = namesSc.next();
            for (int i = 1; i <= 3; i++) {
                double scoreOut = scoresSc.nextDouble();
                System.out.println("The score for " + nameOut + " in class " + i + " is " + scoreOut);
            }
        }

        namesFr.close();
        scoresFr.close();
    }
}
