// package Day_6;

import java.util.Scanner;

public class q21 {
    static void reverse(int n) {

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        int r;
        String binary = "";
        while (n != 0) {
            r = n % 2;
            binary = r + binary;
            n = n / 2;

        }
        System.out.println("Binary " + binary);
        sc.close();

    }

}
