package arrayTwodim;

import java.util.Scanner;

public class rotate90 {

    public static int[][] rotateMatrix(int[][] arr) {

        int r = arr.length;
        int c = arr[0].length;
        int[][] transpose = new int[c][r];

        // transpose of matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        int tr = transpose.length;
        int tc = transpose[0].length;
        int[][] result = new int[tr][tc];
        // col reverse
        for (int i = 0; i < tr; i++) {
            for (int j = 0; j < tc; j++) {
                result[i][j] = transpose[i][tc - j - 1];
            }
        }

        return result;

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

            int[][] result = rotateMatrix(arr);
            // print array
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    System.out.print("\t" + result[i][j]);
                }
                System.out.print("\n");
            }
        }
    }

}
