public class q40 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 65; i <= 69; i++) {

            for (int j = 69; j > i; j--) {

                System.out.print("  ");
            }

            for (int j = 65; j <= i; j++) {
                System.out.print((char) j + " ");

            }

            for (int j = i - 1; j > 65; j--) {
                System.out.print((char) j + " ");

            }
            System.out.println();
        }

    }
}
