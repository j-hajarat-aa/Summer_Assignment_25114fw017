// package Day_22;

import java.util.Scanner;

public class q85 {

    static void palindrome(String str) {
        int n = str.length();
        String reverse = "";

        for (int i = n - 1; i >= 0; i--) {

            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println("String is palindrome");

        } else {
            System.out.println("String is not palindrome");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = sc.nextLine();
        palindrome(str);
        sc.close();

    }

}
