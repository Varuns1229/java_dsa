package pattern;

import java.util.*;

public class diagonalline2 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int space = n - 1;

        System.out.println("space-loop");
        for (int i = 0; i < n; i++) {

            // print spaces
            for (int j = 0; j < space; j++) {
                System.out.print("\t");
            }

            System.out.print("*\t");

            space--;
            System.out.println();
        }
        System.out.println("line-equation");

        for (int i = 1; i <= n; i++) {

            // print star
            for (int j = 1; j <= n; j++) {
                if (j + i == n + 1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

}
