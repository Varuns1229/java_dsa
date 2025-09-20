package array;

import java.util.Scanner;

public class floorCeilSearch {

    public static void searchFloorCeil(int[] arr, int srh) {
        int len = arr.length;
        int st = 0;
        int et = len - 1;
        int floor = -1;
        int ceil = -1;

        int mid = (st + et) / 2;
        while (st <= et) {
            if (arr[mid] == srh) {
                System.out.print("found number :==>" + arr[mid] + " index " + mid);
            } else if (arr[mid] > srh) {
                et = mid - 1;
                ceil = mid;
                mid = (st + et) / 2;
            } else if (arr[mid] < srh) {
                st = mid + 1;
                floor = mid;
                mid = (st + et) / 2;
            }
        }
        System.out.print("floor value :==>" + arr[floor]);
        System.out.print("ceil value :==>" + arr[ceil]);
    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int value = scn.nextInt();
            int[] arr = new int[n];

            // create array
            for (int i = 0; i < n; i++) {
                int num = scn.nextInt();
                arr[i] = num;
            }

            searchFloorCeil(arr, value);

        }

    }
}
