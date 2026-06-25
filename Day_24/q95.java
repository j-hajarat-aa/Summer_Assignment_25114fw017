// package Day_24;

import java.util.Scanner;

public class q95 {

    static String longestWord(String str) {

        String temp = "";
        String longest = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                temp += str.charAt(i);
            } else {

                if (temp.length() > longest.length()) {
                    longest = temp;
                }

                temp = "";
            }
        }

        if (temp.length() > longest.length()) {
            longest = temp;
        }

        return longest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sentence : ");
        String str = sc.nextLine();

        System.out.println("Longest Word = " + longestWord(str));

    }
}
