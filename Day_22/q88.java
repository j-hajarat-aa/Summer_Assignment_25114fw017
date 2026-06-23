import java.util.Scanner;

public class q88 {

    static String removespaces(String str) {
        int n = str.length();

        String ans = "";
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != ' ') {
                ans += str.charAt(i);
            }
        }
        return ans;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        String ans = removespaces(str);
        System.out.println("String after remove spaces: " + ans);
        sc.close();
    }

}
