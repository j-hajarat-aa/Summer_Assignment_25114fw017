// package Day_4;

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        int r, sum = 0, digit = 0;
        int temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = sum + (int) Math.pow(r, digit);
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println("Number is armostrong");
        } else
            System.out.println("Number is not armstrong");
        sc.close();
    }

}
