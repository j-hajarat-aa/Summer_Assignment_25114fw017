import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // ---->>>>>brute-force methode<<<<<-----

        // int max = Math.max(a, b);
        // for (int i = max; i <= a * b; i++) {
        // if (i % a == 0 && i % b == 0) {
        // System.out.println("LCM is :" + i);
        // break;

        // }

        // }

        // euclid methode

        int r;
        int tempa = a, tempb = b;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;

        }
        int gcd = a;
        int LCM = (tempa * tempb) / gcd;
        System.out.println("LCM is :" + LCM);

        sc.close();

    }

}
