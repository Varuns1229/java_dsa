import java.util.*;

public class primefactorization {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int prime = 2;

        while (prime * prime <= n) {
            if (n % prime == 0) {
                System.out.print(prime + " ");
                n = n / prime;
            } else
                prime++;
        }
        System.out.println(n);
    }

}
