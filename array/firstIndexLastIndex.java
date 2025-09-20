package array;

import java.util.Scanner;

public class firstIndexLastIndex {

    public static int firstIndex(int[] arr, int srh) {
        int len = arr.length;
        int st = 0;
        int et = len - 1;
        int firstIdx = -1;

        while (st <= et) {
            int mid = (st + et) / 2;
            if (arr[mid] == srh) {
                firstIdx = mid;
                et = mid - 1;
            } else if (arr[mid] > srh) {
                et = mid - 1;
            } else if (arr[mid] < srh) {
                st = mid + 1;
            }
        }
        return firstIdx;
    }

    public static int lastIndex(int[] arr, int srh) {
        int len = arr.length;
        int st = 0;
        int et = len - 1;
        int lastIdx = -1;

        while (st <= et) {
            int mid = (st + et) / 2;
            if (arr[mid] == srh) {
                lastIdx = mid;
                st = mid + 1;
            } else if (arr[mid] > srh) {
                et = mid - 1;
            } else if (arr[mid] < srh) {
                st = mid + 1;
            }
        }
        return lastIdx;
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

            int firstidx = firstIndex(arr, srh);
            int lastIdx = lastIndex(arr, srh);
            System.out.println("firstidx==> :" + firstidx);
            System.out.println("lastIdx==> :" + lastIdx);

        }
    }
}
