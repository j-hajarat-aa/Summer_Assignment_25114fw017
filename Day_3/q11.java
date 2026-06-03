import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter big number:");
        int a = sc.nextInt();
        System.out.println("Enter small number:");
        int b = sc.nextInt();
        int r;

        while (b != 0) {
            r = a % b;
            a = b;
            b = r;

        }
        System.out.println("GCD of both number is :" + a);
        sc.close();
    }

}
