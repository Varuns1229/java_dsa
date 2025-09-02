package array;

import java.util.Scanner;

public class reverse {

    public static int[] reverseArray(int[] arr) {

        int[] reverse = new int[arr.length];
        int revdigit = reverse.length - 1;
        int arrdigit = arr.length - 1;

        while (arrdigit > -1) {
            reverse[revdigit - arrdigit] = arr[arrdigit];

            arrdigit--;

        }

        return reverse;

    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n1 = scn.nextInt();
            int[] arr1 = new int[n1];

            // create array 1
            for (int i = 0; i < n1; i++) {
                int num = scn.nextInt();
                arr1[i] = num;
            }

            int[] arr = reverseArray(arr1);

            // print result;
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

        }
    }

}
