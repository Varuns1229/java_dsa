package functions;

import java.util.*;

public class digitfrequency {

    public static int digitCount(int num, int digit) {
        int count = 0;

        while (num > 0) {
            int lval = num % 10;
            num = num / 10;
            if(lval == digit)
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int d = scn.nextInt();

            int ans = digitCount(n, d);
            System.out.println(d + " digit count = " + ans);
        }
    }
}
