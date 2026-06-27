// package Day_25;

import java.util.HashSet;

public class q98 {

    static void commonCharacters(String s1, String s2) {

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            set.add(s1.charAt(i));
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);

            if (set.contains(ch)) {
                System.out.print(ch + " ");
                set.remove(ch);
            }
        }
    }

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "world";

        commonCharacters(s1, s2);
    }
}
