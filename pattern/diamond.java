package pattern;

import java.util.*;

public class diamond {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int space = n / 2;
        int star = 1;

        System.out.println("space-loop");
        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            // print star
            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i > n / 2) {
                space++;
                star -= 2;
            } else {
                space--;
                star += 2;
            }
        }

        System.out.println("line-equation");

        for (int i = 1; i <= n; i++) {

            // print star
            for (int j = 1; j <= n; j++) {
                if ((i + j < (n + 3) / 2) || (i - j > (n - 1) / 2) || (j - i > (n - 1) / 2)
                        || (i + j > ((3 * n) + 1) / 2))
                    System.out.print("\t");
                else
                    System.out.print("*\t");
            }
            System.out.println();
        }
    }

}
