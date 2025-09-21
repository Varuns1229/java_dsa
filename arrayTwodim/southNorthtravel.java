package arrayTwodim;

import java.util.Scanner;

public class southNorthtravel {

    public static void southNorthTraveller(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < col; i++) {
            if (i % 2 == 0)
                for (int j = 0; j < row; j++)
                    System.out.print(arr[j][i] + "\t");
            else
                for (int j = row - 1; j >= 0; j--)
                    System.out.print(arr[j][i] + "\t");

            System.out.println();

        }

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

            southNorthTraveller(arr);

        }
    }

}
