// package Day_11;

import java.util.Scanner;

public class q44 {
    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int a = sc.nextInt();
        System.out.println("Factorial of " + a + " is " + factorial(a));
        sc.close();

    }

}
