package array;

import java.util.Scanner;

public class binarysearch {

    public static int searchIdx(int[] arr, int srh) {
        int len = arr.length;
        int st = 0;
        int et = len - 1;

        int mid = (st + et) / 2;
        while (st <= et) {
            if (arr[mid] == srh) {
                System.out.print("found number :");
                return mid;
            } else if (arr[mid] > srh) {
                et = mid - 1;
                mid = (st + et) / 2;
            } else if (arr[mid] < srh) {
                st = mid + 1;
                mid = (st + et) / 2;
            }
        }
        System.out.print("not found number :");
        return -1;
    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int srh = scn.nextInt();
            int[] arr = new int[n];

            // create array
            for (int i = 0; i < n; i++) {
                int num = scn.nextInt();
                arr[i] = num;
            }

            int result = searchIdx(arr, srh);
            System.out.print("result==> :" + result);

        }
    }
}
