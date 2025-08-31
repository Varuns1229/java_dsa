package array;

import java.util.Scanner;

public class barChart {

    public static void BarChart(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // printing bar chart
        for (int i = max; i > 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (i <= arr[j]) {
                    System.out.print("❤️\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("\n");

        }
    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                int num = scn.nextInt();
                arr[i] = num;
            }

            BarChart(arr);
        }
    }
}
