package array;

import java.util.Scanner;

public class rotateArray {

    public static void reverseArray(int[] arr, int lo, int hi) {

        while (lo < hi) {
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;

            lo++;
            hi--;
        }

    }

    public static void rotate(int[] arr, int k) {

        int n = arr.length;

        k = k % n;

        if (k < 0) {
            k = k + n;
        }

        // rotate first part
        reverseArray(arr, 0, k - 1);

        // rotate second part
        reverseArray(arr, k, n - 1);

        // rotate complete part
        reverseArray(arr, 0, n - 1);

    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int k = scn.nextInt();
            int[] arr = new int[n];

            // create array
            for (int i = 0; i < n; i++) {
                int num = scn.nextInt();
                arr[i] = num;
            }

            rotate(arr, k);

            // print result;
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

        }
    }

}
