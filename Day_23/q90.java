// package Day_23;

public class q90 {

    static char firstRepeatingChar(String str) {

        int n = str.length();

        for (int i = 0; i < n; i++) {
            boolean repeating = false;

            for (int j = 0; j < n; j++) {

                if (i != j && str.charAt(i) == str.charAt(j)) {
                    repeating = true;
                    break;

                }
            }
            if (repeating) {
                return str.charAt(i);

            }
        }

        return '\0';

    }

    public static void main(String[] args) {
        String str = "abca";
        System.out.println("First non repeating charectar is " + firstRepeatingChar(str));
    }



    
}
