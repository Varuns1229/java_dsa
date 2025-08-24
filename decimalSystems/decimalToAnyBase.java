package decimalSystems;

import java.util.*;

public class decimalToAnyBase {

    public static int anyBase(int num, int base) {
        int val = 0;
        int power = 1;
 
        while (num > 0) {
            int rim = num % base;
            num = num / base;
            val += rim * power;
            power = power * 10;
         
        }
        return val;
    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int d = scn.nextInt();

            int ans = anyBase(n, d);
            System.out.println("answer ==> " + ans);
        }
    }
}
