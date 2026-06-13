// package Day_12;

import java.util.Scanner;

public class q46 {
    static void armstrong(int n) {
        int r, digit = 0, sum = 0;
        int temp = n;
        int temp1 = n;
        while (n != 0) {
            n = n / 10;
            digit++;
        }
        while (temp != 0) {
            r = temp % 10;
            sum += (int) Math.pow(r, digit);
            temp = temp / 10;

        }
        if (sum == temp1) {
            System.out.println("Number is armstrong");
        } else {
            System.out.println("number is not armstrong");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = sc.nextInt();
        armstrong(a);
        sc.close();

    }

}
