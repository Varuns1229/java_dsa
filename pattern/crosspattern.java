package pattern;

import java.util.*;

public class crosspattern {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int space = 0;
        int middleSpace = n - 2;

        System.out.println("space-loop");
        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int j = 0; j < space; j++) {
                System.out.print("\t");
            }
            // print star
            System.out.print("*\t");

            // print spaces
            for (int j = 1; j <= middleSpace; j++) {
                System.out.print("\t");
                if (j == middleSpace) {
                    System.out.print("*\t");
                }
            }
            if (i > n / 2) {
                space--;
                middleSpace += 2;
            } else {
                space++;
                middleSpace -= 2;
            }
            System.out.println();
        }
        System.out.println("line-equation");

        for (int i = 1; i <= n; i++) {

            // print star
            for (int j = 1; j <= n; j++) {
                if (j + i == n + 1 || i == j)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

}
