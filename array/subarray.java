package array;

import java.util.Scanner;

public class subarray {

    public static void subarrayPrint(int[] arr) {
        int n = arr.length;

        for (int st = 0; st < n; st++) {
            for (int et = st; et <= n; et++) {

                for (int k = st; k < et; k++) {
                    System.out.print(arr[k] + "\t");

                }
                System.out.println("");

            }

        }

    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] arr = new int[n];

            // create array
            for (int i = 0; i < n; i++) {
                int num = scn.nextInt();
                arr[i] = num;
            }

            subarrayPrint(arr);

        }
    }
}
