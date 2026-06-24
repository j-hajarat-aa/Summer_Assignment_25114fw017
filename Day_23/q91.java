import java.util.Arrays;

public class q91 {

    static boolean isanagram(String str1, String str2) {

        boolean ans = false;
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        ans = Arrays.equals(a, b);

        return ans;
    }

}
