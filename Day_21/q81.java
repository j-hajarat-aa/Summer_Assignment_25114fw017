// package Day_21;

public class q81 {
    static int stringlength(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;

        }
        return count;

    }

    public static void main(String[] args) {
        String str = "Hajarat";
        System.out.println("Length of string is " + stringlength(str));
    }

}
