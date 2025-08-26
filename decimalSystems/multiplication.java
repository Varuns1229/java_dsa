package decimalSystems;

import java.util.Scanner;

public class multiplication {

    public static int multiplactionMthod(int n1, int d, int base) {
        int product = 0;
        int carry = 0;
        int power = 1;

        while (n1 > 0 || carry > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;

            int mul = d1 * d + carry;
            int rim = mul % base;
            carry = mul / base;
            product += rim * power;
            power = power * 10;
        }

        return product;

    }

    public static int additionMethod(int n1, int n2, int base) {
        int ans = 0;
        int power = 1;
        int carry = 0;

        while (n1 > 0 || n2 > 0 || carry > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n2 = n2 / 10;
            n1 = n1 / 10;

            int sum = d1 + d2 + carry;
            int rim = sum % base;
            carry = sum / base;
            ans += rim * power;
            power = power * 10;

        }
        return ans;
    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();
            int base = scn.nextInt();

            int ans = 0;
            int power = 1;

            while (n2 > 0) {
                int d = n2 % 10;
                n2 = n2 / 10;
                int product = multiplactionMthod(n1, d, base);
                ans = additionMethod(product * power, ans, base);
                power = power * 10;

            }
            System.out.println("answer ==> " + ans);
        }
    }
}
