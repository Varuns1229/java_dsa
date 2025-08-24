package decimalSystems;

import java.util.Scanner;

public class anybaseToDecimal {
    public static int anyBaseToDecimal(int num, int base) {
        int val = 0;
        int power = 1;

        while (num > 0) {
            int rim = num % 10;
            num = num / 10;
            val += rim * power;
            power = power * base;

        }
        return val;
    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int base = scn.nextInt();

            int ans = anyBaseToDecimal(n, base);
            System.out.println("answer ==> " + ans);
        }
    }
}
