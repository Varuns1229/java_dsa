package decimalSystems;

import java.util.Scanner;

public class subtraction {

    public static int subtractionmethod(int num1, int num2, int base) {
        int borrow = 0;
        int val = 0;
        int power = 1;

        while (num1 > 0 || num2 > 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            num1 = num1 / 10;
            num2 = num2 / 10;

            int sub = (digit1 + borrow) - digit2;
            if (sub < 0) {
                sub += base;
                borrow = -1;

            } else {
                borrow = 0;
            }
            val += sub * power;
            power = power * 10;
        }

        return val;
    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();
            int base = scn.nextInt();

            int ans = subtractionmethod(n1, n2, base);
            System.out.println("answer ==> " + ans);
        }
    }
}
