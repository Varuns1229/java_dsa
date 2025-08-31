package array;

import java.util.Scanner;

public class additionOfArray {

    public static int[] addition(int[] arr1, int[] arr2, int base) {

        int carry = 0;
        int maxlen = arr1.length > arr2.length ? arr1.length + 1 : arr2.length + 1;
        int[] result = new int[maxlen];

        int arr1len = arr1.length - 1;
        int arr2len = arr2.length - 1;
        int resultlen = result.length - 1;
        
        while (resultlen > -1) {
            int sum = 0;
            if (arr1len > -1) {
                sum += arr1[arr1len];
            }
            // System.out.println(sum);
            
            if (arr2len > -1) {
                sum += arr2[arr2len];
            }
            // System.out.println(arr2[arr2len]);
            
            sum += carry;
            // System.out.println(sum);
            int d = sum % base;
            carry = sum / base;
            // System.out.println(carry);

            result[resultlen] = d;

            arr1len--;
            arr2len--;
            resultlen--;

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

            int[] arr = addition(arr1, arr2, base);

            // print result;
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

        }
    }

}
