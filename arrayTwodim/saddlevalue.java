package arrayTwodim;

import java.util.Scanner;

public class saddlevalue {

    public static int saddleValue(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {
            int minRow = arr[i][0];
            int col = 0;
            for (int j = 0; j < c; j++) {

                if (minRow > arr[i][j]) {

                    minRow = arr[i][j];
                    col = j;
                }
            }
            Boolean isSaddle = true;
            for (int k = 0; k < r; k++) {

                if (arr[k][col] > minRow)
                    isSaddle = false;
            }
            if (isSaddle)
                return minRow;

        }

        return 0;
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

            int value = saddleValue(arr);

            if (value == -1)
                System.out.print("\t Invalid");
            else
                System.out.print("\t result==>" + value);
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

}
