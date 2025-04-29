import java.io.*;
import java.util.*;

public class gcdandlcm {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int gcd = 1;

        int dividend = n1;
        int divisor = n2;

        while (dividend % divisor != 0) {
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;

        }
        gcd = divisor;
        int lcm = n1 * n2 / gcd;
        System.out.println("gGCDcd==>" + gcd);
        System.out.println("LCM==>" + lcm);

    }
}
