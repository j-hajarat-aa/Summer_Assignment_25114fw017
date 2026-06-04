// package Day_4;

import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter range in which armstrong number you want :");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int temp3;

        for (int i = n; i < m; i++) {

            int digit = 0;
            int temp1 = i;

            while (temp1 > 0) {
                temp1 = temp1 / 10;
                digit++;
            }
            temp1 = i;
            int sum = 0;
            while (temp1 > 0) {
                int r = temp1 % 10;
                sum = sum + (int) Math.pow(r, digit);
                temp1 = temp1 / 10;
                if (sum == i) {
                    System.out.print(i + " ");
                }

            }
        }
        sc.close();

    }

}
