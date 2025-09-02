package array;

import java.util.Scanner;

public class subtractionOfArray {

    public static int[] subtraction(int[] arr1, int[] arr2, int base) {

        int max = arr1.length > arr2.length ? arr1.length : arr2.length;
        int[] result = new int[max];

        int a1lastdigit = arr1.length - 1;
        int a2lastdigit = arr2.length - 1;
        int resultlastdigit = result.length - 1;
        int borrow = 0;

        while (resultlastdigit > -1) {
            int sum = 0;
            if (a1lastdigit > -1) {
                sum = (arr1[a1lastdigit] + borrow);
            }
            if (a2lastdigit > -1) {
                sum -= arr2[a2lastdigit];
            }

            if (sum < 0) {
                sum += base;
                borrow = -1;
            } else {
                borrow = 0;
            }
            result[resultlastdigit] = sum;

            a1lastdigit--;
            a2lastdigit--;
            resultlastdigit--;
        }

        return result;

    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int base = scn.nextInt();
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();
            int[] arr1 = new int[n1];
            int[] arr2 = new int[n2];
            // create array 1
            for (int i = 0; i < n1; i++) {
                int num = scn.nextInt();
                arr1[i] = num;
            }
            // create array 2
            for (int i = 0; i < n2; i++) {
                int num = scn.nextInt();
                arr2[i] = num;
            }

            int[] arr = subtraction(arr1, arr2, base);

            // print result;
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

        }
    }

}
