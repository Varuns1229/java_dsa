package arrayTwodim;

import java.util.Scanner;

public class matrixMultiplication {

    public static int[][] multiplication(int[][] arr1, int[][] arr2) {
        int row1 = arr1.length;
        int col1 = arr1[0].length;
        int row2 = arr2.length;
        int col2 = arr2[0].length;
        int[][] result = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                int sum = 0;
                for (int k = 0; k < col1; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int r1 = scn.nextInt();
            int c1 = scn.nextInt();
            int[][] arr1 = new int[r1][c1];

            // create array
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    int num = scn.nextInt();
                    arr1[i][j] = num;
                }
            }
            System.out.print("Enter second array");

            int r2 = scn.nextInt();
            int c2 = scn.nextInt();
            int[][] arr2 = new int[r2][c2];

            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    int num = scn.nextInt();
                    arr2[i][j] = num;
                }
            }

            if (c1 != r2) {
                System.out.print("invalid Input");
                return;
            }

            int[][] result = multiplication(arr1, arr2);

            // print array
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    System.out.print(result[i][j] + "\t");
                }
                System.out.println();
            }

        }
    }
}
