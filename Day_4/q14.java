// package Day_4;

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter which term you want:");
        int n = sc.nextInt();
        int a = 0, b = 1, c = 0;

        while (c <= n) {
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println(n + "th term of fibonacci series is : " + c);
        sc.close();

    }

}
