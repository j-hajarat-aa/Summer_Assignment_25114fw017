// package Day_21;

public class q82 {

    static String reverseOfString(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        return reverse;
    }

    public static void main(String[] args) {

        String str = "Hajarat";

        System.out.println("Reverse of string is " + reverseOfString(str));
    }

}
