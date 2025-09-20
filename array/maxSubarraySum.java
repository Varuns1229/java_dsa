package array;

import java.util.Scanner;

public class maxSubarraySum {

    public static int maxSubArraySum(int[] arr) {

        // Kadane's alogo
        int len = arr.length;
        int continousSum = arr[0];
        int maxSum = arr[0];
        int cst = 0;
        int mst = 0;
        int met = 0;

        for (int i = 1; i < len; i++) {
            int sum = continousSum + arr[i];
            if (sum > arr[i]) {
                continousSum = sum;
            } else {
                continousSum = arr[i];
                cst = i;
            }
            if (continousSum > maxSum) {
                mst = cst;
                met = i;
                maxSum = continousSum;
            }

        }

        for (int i = mst; i <= met; i++) {
            System.out.print(arr[i] + "\t");
        }

        return maxSum;
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

            int maxSum = maxSubArraySum(arr);
            System.out.println("maxSum==> :" + maxSum);

        }
    }
}
