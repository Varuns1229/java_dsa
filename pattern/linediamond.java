package pattern;

import java.util.*;

public class linediamond {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int space = n / 2;
        int middleSpace = -1;

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
            }
            // print star
            if (i != 1 && i != n) {
                System.out.print("*\t");
            }
            if (i > n / 2) {
                space++;
                middleSpace -= 2;
            } else {
                space--;
                middleSpace += 2;
            }
            System.out.println();
        }
    }

}
