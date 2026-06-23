import java.util.HashMap;
import java.util.Scanner;

public class q87 {

    static HashMap<Character, Integer> frequency(String str) {

        int n = str.length();
        HashMap<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {

            freq.put(str.charAt(i), freq.getOrDefault(str.charAt(i), 0) + 1);

        }
        return freq;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();

        System.out.println("Frequency of each elements are mentioned:" + frequency(str));
        sc.close();
    }

}
