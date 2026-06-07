// package Day_7;

import java.util.Scanner;

public class q26 {
    static int fabonacci(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fabonacci(n - 1) + fabonacci(n - 2);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

        System.out.println("Fibonacci term is: " + fabonacci(n));
        sc.close();

    }

}
