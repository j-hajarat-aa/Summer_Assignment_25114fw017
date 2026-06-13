// package Day_12;

import java.util.Scanner;

public class q45 {
    static void palindrome(int n) {
        int reverse = 0;
        int temp = n;

        while (n != 0) {
            int r = n % 10;
            reverse = reverse * 10 + r;
            n = n / 10;
        }
        if (temp == reverse) {
            System.out.println("Number is palindrome");

        } else {
            System.out.println("Number is not palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        palindrome(a);
        sc.close();
    }

}
