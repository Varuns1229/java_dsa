import java.util.*;
import java.io.*;

public class tillprime {

    public static void main(String[] args) {

        try (Scanner scn = new Scanner(System.in)) {
            int tillnum = scn.nextInt();

            for (int i = 2; i <= tillnum; i++) {
                boolean isPrime = true;
                for (int j = 2; j * j <= i; j++) {
                    while (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime == true)
                    System.out.println(i);

            }
        }
    }
}