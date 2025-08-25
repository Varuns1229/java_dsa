package decimalSystems;

import java.util.Scanner;

public class anybaseToanyBase {

    public static int anyBaseToanyBase(int num, int sb, int base) {
        int decimalval = 0;
        int power = 1;
        int val = 0;

        while (num > 0) {
            int rim = num % 10;
            num = num / 10;
            decimalval += rim * power;
            power = power * sb;
        }
        power = 1;
        while (decimalval > 0) {
            int rim = decimalval % base;
            decimalval = decimalval / base;
            val += rim * power;
            power = power * 10;
        }
        return val;
    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int sb = scn.nextInt();
            int base = scn.nextInt();

            int ans = anyBaseToanyBase(n, sb, base);
            System.out.println("answer ==> " + ans);
        }
    }
}
