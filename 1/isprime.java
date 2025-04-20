import java.util.*;
import java.io.*;

public class isprime {

    public static void main(String[] args) {

        try (Scanner scn = new Scanner(System.in)) {
            int cycle = scn.nextInt();

            for (int i = 1; i <= cycle; i++) {
                int num = scn.nextInt();
                boolean isPrime = true;
                for (int j = 2; j*j < num; j++) {
                    while (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime == true)
                    System.out.println("prime");
                else
                    System.out.println("not prime");

            }
        }
    }
}