package array;

import java.util.Scanner;

public class inverseArray {
    public static int[] inverse(int[] arr) {
        int n = arr.length;
        int[] inv = new int[n];
        for (int i = 0; i < n; i++) {
            int idz = arr[i];
            inv[idz] = i;

        }
        return inv;

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

            int[] result = inverse(arr);

            // print result;
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }

        }
    }

}
