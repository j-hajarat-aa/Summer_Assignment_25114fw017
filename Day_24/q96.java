// package Day_24;

import java.util.Scanner;

public class q96 {

    static String removeDuplicate(String str) {

        String ans = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ans.indexOf(ch) == -1) {
                ans += ch;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.next();

        System.out.println(removeDuplicate(str));

    }
}
