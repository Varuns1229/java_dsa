package arrayTwodim;

import java.util.Scanner;

public class spiralArray {

    public static void spiral(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int rs = 0;
        int re = row - 1;
        int cs = 0;
        int ce = col - 1;

        int total = row * col;

        while (total > 0) {
            // print left col
            for (int i = rs; total > 0 && i <= re; i++) {
                System.out.print(arr[i][cs] + "\t");
                total--;
            }
            cs++;

            // print down row
            for (int i = cs; total > 0 && i <= ce; i++) {
                System.out.print(arr[re][i] + "\t");
                total--;
            }
            re--;

            // print right col
            for (int i = re; total > 0 && i >= rs; i--) {
                System.out.print(arr[i][ce] + "\t");
                total--;
            }
            ce--;

            // print top row
            for (int i = ce; total > 0 && i >= cs; i--) {
                System.out.print(arr[rs][i] + "\t");
                total--;
            }
            rs++;
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

            spiral(arr);

        }
    }
}
