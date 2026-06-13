// package Day_12;

import java.util.Scanner;

public class q47 {
    static void fibonacci(int n) {

        int a = 0, b = 1, c = 0;
        System.out.println("Fibonacci series is : ");
        while (c <= n) {
            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        fibonacci(a);
        sc.close();
    }

}
