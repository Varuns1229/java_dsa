package pattern;

import java.util.*;

public class combinationtriangle {

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();

            for (int i = 0; i < n; i++) {
                int comb = 1; // iC_1 always 1
                for (int j = 0; j < i; j++) {

                    System.out.print(comb + "\t");
                    comb = (comb * (i - j) / (j + 1));
                }
                System.out.println();
            }
        }
    }
}
