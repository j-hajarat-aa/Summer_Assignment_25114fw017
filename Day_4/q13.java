// package Day_4;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number upto series you want:");
        int n = sc.nextInt();
        int a = 0, b = 1, c = 0;
        System.out.println("Fibonacci series is:");
        while (c <= n) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
        sc.close();

    }

}
