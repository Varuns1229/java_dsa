package array;

import java.util.Scanner;

public class subsetsOfArray {

    public static int[] binaryArray(int num, int length) {
        int[] binArry = new int[length];
        int i = length;

        while (num > 0) {
            int rim = num % 2;
            binArry[i - 1] = rim;
            num = num / 2;
            i--;
        }

        return binArry;

    }

    public static void subsetsPrint(int[] arr1) {
        int n = arr1.length;
        int pow = 1;
        while (n > 0) {
            pow = pow * 2;
            n--;
        }
        for (int i = 0; i < pow; i++) {
            int[] binArry = binaryArray(i, arr1.length);
            for (int j = 0; j < binArry.length; j++) {
                if (binArry[j] == 1)
                    System.out.print(arr1[j] + " ");
                else
                    System.out.print("- ");
            }
            System.out.print(" \n");
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

            subsetsPrint(arr);

        }
    }

}
