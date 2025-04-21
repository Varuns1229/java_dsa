
import java.io.*;
import java.util.*;

public class printnumberorder {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        int temp = num;
        int total = 0;

        while (temp != 0) {
            total++;
            temp = temp / 10;
        }

        int i = 0;
        int pow = 1;
        while (i < (total - 1)) {
            pow = 10 * pow;
            i++;
        }

        while (pow != 0) {
            int num1 = num / pow;
            num = num % (pow);
            pow= pow/10;
            System.out.println(num1);
        }

    }
}