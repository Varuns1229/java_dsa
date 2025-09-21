package arrayTwodim;

import java.util.Scanner;

public class exitPath {

    public static void exitCell(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        int r = 0;
        int c = 0;
        int dir = 0;
        int exitRow = 0;
        int exitCol = 0;

        while (r < row && c < col) {
            dir = (arr[r][c] + dir) % 4;
            System.out.print("-->" + r + c);
            exitRow = r;
            exitCol = c;
            if (dir == 0) {
                c++;
            }
            if (dir == 1) {
                r++;
            }
            if (dir == 2) {
                c--;
            }
            if (dir == 3) {
                r--;
            }

        }
        System.out.println("\nexit col ==> " + exitRow + exitCol);

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

            System.out.print("path==>");
            exitCell(arr);
        }
    }

}
