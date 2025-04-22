import java.util.Scanner;

public class rotatenumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int k = scn.nextInt();
        int temp = num;
        int i = 0;
        int pow = 1;

        int totalCount = 0;

        // find total count
        while (temp != 0) {
            totalCount++;
            temp = temp / 10;
        }

        k = k % totalCount;

        if (k < 0)
            k = totalCount + k;

        // create the pow
        while (i < k) {
            pow = pow * 10;
            i++;
        }
        int b = num % pow;
        int a = num / pow;
        i = 0;

        while (i < totalCount - k) {
            b = b * 10;
            i++;
        }
        System.out.println(b + a);
        // scn.close();

    }
}
