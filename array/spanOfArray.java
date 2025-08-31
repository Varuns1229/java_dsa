package array;

import java.util.Scanner;

public class spanOfArray {

    public static int arrayspan(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return max - min;

    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                int num = scn.nextInt();
                arr[i] = num;
            }

            int ans = arrayspan(arr);
            System.out.println("answer ==> " + ans);
        }
    }

}
