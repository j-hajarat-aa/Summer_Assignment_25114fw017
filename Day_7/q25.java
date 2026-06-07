// package Day_7;

import java.util.Scanner;

public class q25 {
    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else
            return n * factorial(n - 1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();
        // factorial(n);
        System.out.println("Factorial of " + n + " is " + factorial(n));
        sc.close();

    }

}
