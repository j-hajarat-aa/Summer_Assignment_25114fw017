// package Day_24;

import java.util.Scanner;

public class q94 {

    static String compress(String str) {

        if (str.length() == 0)
            return "";

        String ans = "";
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                ans += str.charAt(i);
                ans += count;
                count = 1;
            }
        }

        ans += str.charAt(str.length() - 1);
        ans += count;

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.next();

        System.out.println(compress(str));

    }
}
