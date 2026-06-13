// package Day_12;

import java.util.Scanner;

public class q48 {
    static void perfectnum(int n) {
        int sum = 0;

        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("Number is perfect");
        } else {
            System.out.println("Number is not perfect");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        perfectnum(a);
        sc.close();

    }

}
