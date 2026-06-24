import java.util.HashMap;

public class q92 {

    static char maxOccurringChar(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        char ans = '\0';
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.get(ch) > max) {
                max = map.get(ch);
                ans = ch;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String str = "hajarat";
        System.out.println(maxOccurringChar(str));
    }
}