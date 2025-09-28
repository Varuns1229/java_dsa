package arrayTwodim;

import java.util.Scanner;

public class ringRotate {

    public static int[] getShellArr(int[][] arr, int s) {

        int row = arr.length;
        int col = arr[0].length;

        // shell points
        int srow = s - 1;
        int scol = s - 1;
        int sRowEnd = row - s;
        int sColEnd = col - s;

        int totalElements = 2 * (sRowEnd - srow) + 2 * (sColEnd - scol);

        int[] shellArr = new int[totalElements];
        int idx = 0;

        // left wall
        for (int i = srow; i <= sRowEnd; i++, idx++) {
            shellArr[idx] = arr[i][scol];
        }
        scol++;

        // bottom wall
        for (int i = scol; i <= sColEnd; i++, idx++) {
            shellArr[idx] = arr[sRowEnd][i];
        }
        sRowEnd--;

        // right wall
        for (int i = sRowEnd; i >= srow; i--, idx++) {
            shellArr[idx] = arr[i][sColEnd];
        }
        sColEnd--;

        // top wall
        for (int i = sColEnd; i >= scol; i--, idx++) {
            shellArr[idx] = arr[srow][i];
        }
        srow++;

        return shellArr;
    }

    public static int[][] setUpdatedShell(int[][] arr, int[] arr1, int s) {

        int row = arr.length;
        int col = arr[0].length;

        // shell points
        int srow = s - 1;
        int scol = s - 1;
        int sRowEnd = row - s;
        int sColEnd = col - s;

        int idx = 0;

        // left wall
        for (int i = srow; i <= sRowEnd; i++, idx++) {
            arr[i][scol] = arr1[idx];
        }
        scol++;

        // bottom wall
        for (int i = scol; i <= sColEnd; i++, idx++) {
            arr[sRowEnd][i] = arr1[idx];
        }
        sRowEnd--;

        // right wall
        for (int i = sRowEnd; i >= srow; i--, idx++) {
            arr[i][sColEnd] = arr1[idx];
        }
        sColEnd--;

        // top wall
        for (int i = sColEnd; i >= scol; i--, idx++) {
            arr[srow][i] = arr1[idx];
        }
        srow++;

        return arr;
    }

    public static void reverse(int[] arr, int lo, int hi) {

        while (lo < hi) {
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }

    }

    public static int[] rotateArr(int[] arr, int r) {

        int n = arr.length;
        if (r > n)
            r = r % n;

        // display1dArr(arr);
        reverse(arr, 0, n - 1);
        reverse(arr, 0, r - 1);
        reverse(arr, r, n - 1);
        // display1dArr(arr);

        return arr;
    }

    public static int[][] shellRotate(int[][] arr, int s, int r) {
        // get the shell array
        int[] arr1 = getShellArr(arr, s);

        // rotate array
        int[] arr2 = rotateArr(arr1, r);

        // setUpdated array
        int[][] arr3 = setUpdatedShell(arr, arr2, s);

        return arr3;
    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int r1 = scn.nextInt();
            int c1 = scn.nextInt();
            int[][] arr = new int[r1][c1];

            // create array
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    int num = scn.nextInt();
                    arr[i][j] = num;
                }
            }
            int s = scn.nextInt();
            int r = scn.nextInt();

            int[][] result = shellRotate(arr, s, r);

            displayArr(result);
        }
    }

    public static void displayArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("\t" + arr[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void display1dArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.print("\n");
    }
}
