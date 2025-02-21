package wk04;

import java.util.Scanner;

public class NoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Stop? (yes/no) ");
        String s = sc.nextLine();

        while (s.equalsIgnoreCase("n") || s.equalsIgnoreCase("no") || s.equalsIgnoreCase("not")) {
            System.out.print("Stop? (yes/no) ");
            s = sc.nextLine();
        }

        System.out.println("Done");
    }
}

/*
Stop? (yes/no) no
Stop? (yes/no) NOt
Stop? (yes/no) n
Stop? (yes/no) yes
        Done
Stop? (yes/no) N
Stop? (yes/no) NO
Stop? (yes/no) NOT
Stop? (yes/no) on
        Done*/
