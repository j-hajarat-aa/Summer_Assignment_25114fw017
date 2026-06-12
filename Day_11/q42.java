// package Day_11;

import java.util.Scanner;

public class q42 {
    static void maxOf3Num(int a, int b, int c) {

        int max;
        if (a > b && b > c) {
            System.out.println("Max is " + a);
        } else if (b > a && a > c) {
            System.out.println("Max is " + b);
        } else {
            System.out.println("Max is " + c);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        maxOf3Num(a, b, c);
        sc.close();

    }

}
