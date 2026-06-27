package Day_25;

import java.util.Arrays;
import java.util.Comparator;

public class q100 {

    public static void main(String[] args) {

        String[] words = {
                "apple",
                "hi",
                "banana",
                "cat",
                "elephant"
        };

        Arrays.sort(words, Comparator.comparingInt(String::length));

        for (String s : words) {
            System.out.println(s);
        }
    }
}
