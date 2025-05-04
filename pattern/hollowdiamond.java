package pattern;

import java.util.*;

public class hollowdiamond {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int star = n / 2;
        int space = 1;

        System.out.println("space-loop");
        for (int i = 1; i <= n; i++) {

            // print star
            for (int j = 0; j <= star; j++) {
                System.out.print("*\t");
            }

            // print spaces
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            // print star
            for (int j = 0; j <= star; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i > n / 2) {
                star++;
                space -= 2;
            } else {
                star--;
                space += 2;
            }
        }
    }

}
