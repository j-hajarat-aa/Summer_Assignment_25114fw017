// package Day_7;

import java.util.Scanner;

public class q27 {

    static int sumDigits(int n) {
        if (n == 0) {
            return 0;

        }
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Sum of digits of " + n + " is " + sumDigits(n));
        sc.close();

    }

}
